/**
 * 
 */
package de.or.xuggler.plugin;

import de.or.dicom.viewer.control.ProgressStatusBarModel;
import de.or.dicom.viewer.control.ViewerFrameManager;
import de.or.dicom.viewer.data.DisplayableUnit;
import de.or.dicom.viewer.data.Instance;
import de.or.dicom.viewer.displayable.DefaultSelectionModel;
import de.or.dicom.viewer.displayable.ImageLayeredData;
import de.or.dicom.viewer.displaymodel.ActiveDataManager;
import de.or.dicom.viewer.event.ExecuteEvent;
import de.or.dicom.viewer.image.StandardImageEncoder;
import de.or.dicom.viewer.tools.EnableTool;
import de.or.dicom.viewer.tools.ToolDescription;
import de.or.utils.config.LocalesConfig;

import java.awt.Dimension;
import java.io.File;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.ICodec.ID;

/**
 * @author Till
 * 
 */
public class ExportDicomLoop extends EnableTool {

    protected static final Logger logger = Logger.getLogger(ExportDicomLoop.class);

    public ExportDicomLoop()
    {
        super();
        description = new ToolDescription();
        description.setId(ExportDicomLoop.class.getName());
        String desc = "Export images as movie";
        desc = LocalesConfig.getString(description.getId() + ".Description", desc);
        description.setDescription(desc);
        description.setIconSource(svg.inout.FromClipboardIcon.class.getName());
        register();
    }

    public boolean couldEnable()
    {
        DisplayableUnit adu = ActiveDataManager.getActiveDisplayableUnit();
        return adu != null && adu.size() > 1 || DefaultSelectionModel.getSelectionModel().size() > 1;
    }

    @Override
    public void execute(ExecuteEvent e)
    {
        super.execute(e);
        // TODO Dialog erfragt
        // * frames/second
        // * Exportziel
        // * Selektion
        // * Format: MP4?

        final List<ImageLayeredData> frames = new Vector<>();
        DefaultSelectionModel sm = DefaultSelectionModel.getSelectionModel();
        if (sm.size() > 1)
            for (Instance instance : sm)
                frames.add(instance.getActiveFrame());
        else
        {
            DisplayableUnit adu = ActiveDataManager.getActiveDisplayableUnit();
            int childNo = adu.getChildNo();
            for (int i = 0; i < childNo; i++)
                frames.add(adu.getChild(i).getActiveFrame());
        }
        new Thread(new Runnable() {

            public void run()
            {
                final ProgressStatusBarModel progress = ViewerFrameManager.createProgressBars(getDescription().getIconSource());
                exportFrames(frames, new File("DICOM-Video.mp4"), ICodec.ID.CODEC_ID_MPEG4, 25, progress);
                ViewerFrameManager.removeProgressBars(progress);
            }
        }).start();
    }

    public static void exportFrames(List<ImageLayeredData> frames, File file, ID codec, int fps,
            ProgressStatusBarModel progress)
    {
        progress.setRangeProperties(0, 1, 0, frames.size() * 2, false);
        logger.info("exporting " + frames.size() + " frames with " + fps + "fps encoded as " + codec + " to "
                + file.getAbsolutePath());
        StandardImageEncoder sie = new StandardImageEncoder("Image encoder for video frames");
        int width = 0;
        int height = 0;
        for (ImageLayeredData ild : frames)
        {
            Dimension is = ild.getImageSize();
            width = Math.max(width, is.width);
            height = Math.max(height, is.height);
            progress.setValue(progress.getValue() + 1);
        }
        final IMediaWriter writer = ToolFactory.makeWriter(file.getAbsolutePath());
        int index = writer.addVideoStream(0, 0, codec, width, height);
        long nextFrameTime = 0;
        final long frameRate = fps;
        for (ImageLayeredData ild : frames)
        {
            sie.setData(ild);
            writer.encodeVideo(index, sie.createWholeImage(), nextFrameTime, TimeUnit.MILLISECONDS);
            nextFrameTime += frameRate;
            progress.setValue(progress.getValue() + 1);
        }
        writer.flush();
        writer.close();
        logger.info("export finished: " + file.getAbsolutePath());
    }
}
