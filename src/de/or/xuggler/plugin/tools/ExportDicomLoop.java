/**
 * 
 */
package de.or.xuggler.plugin.tools;

import de.or.dicom.viewer.control.ProgressStatusBarModel;
import de.or.dicom.viewer.control.ViewerFrameManager;
import de.or.dicom.viewer.data.DisplayableUnit;
import de.or.dicom.viewer.data.Instance;
import de.or.dicom.viewer.dialog.OnTopDialog;
import de.or.dicom.viewer.dialog.TargetPanel;
import de.or.dicom.viewer.displayable.DefaultSelectionModel;
import de.or.dicom.viewer.displayable.ImageLayeredData;
import de.or.dicom.viewer.displaymodel.ActiveDataManager;
import de.or.dicom.viewer.displaymodel.DisplayListModel;
import de.or.dicom.viewer.event.ExecuteEvent;
import de.or.dicom.viewer.image.StandardImageEncoder;
import de.or.dicom.viewer.tasks.ExportTask;
import de.or.dicom.viewer.tools.ToolDescription;
import de.or.dicom.viewer.tools.inout.AbstractExportTool;
import de.or.utils.config.LocalesConfig;
import de.or.xuggler.plugin.icons.UbuntuStudioIconsVideoProductionIcon;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

import org.apache.log4j.Logger;

import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.xuggler.ICodec.ID;

/**
 * @author Till
 * 
 */
public class ExportDicomLoop extends AbstractExportTool {

    protected static final Logger logger = Logger.getLogger(ExportDicomLoop.class);

    public ExportDicomLoop()
    {
        super();
        description = new ToolDescription();
        description.setId(ExportDicomLoop.class.getName());
        String desc = "Export images as movie";
        desc = LocalesConfig.getString(description.getId() + ".Description", desc);
        description.setDescription(desc);
        description.setIconSource(UbuntuStudioIconsVideoProductionIcon.class.getName());
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
        JFrame currentFrame = ViewerFrameManager.getCurrentFrame();
        final ExportDicomLoopDialog dialog = new ExportDicomLoopDialog(currentFrame, new ExportTask(), this);
        dialog.setLocationRelativeTo(currentFrame);
        dialog.setVisible(true);

        if (dialog.getActionCommand().equals(OnTopDialog.CANCEL))
        {
            logger.info("export dicom loop canceled");
            return;
        }
        final List<ImageLayeredData> frames = new Vector<>();
        DisplayListModel<Instance> si = dialog.getSelectedImages();
        for (Instance instance : si)
            for (ImageLayeredData ild : instance.getFrames())
                frames.add(ild);
        new Thread(new Runnable() {

            public void run()
            {
                String iconSource = getDescription().getIconSource();
                final ProgressStatusBarModel progress = ViewerFrameManager.createProgressBars(iconSource);
                ExportVideoFormat format = dialog.getSelectedCodec();

                try
                {
                    exportFrames(frames, new File("DICOM-Video." + format.fileExtension),
                            format.codec.getID(), dialog.getSelectedFrameRate(), progress);
                } catch (Exception ex)
                {
                    logger.warn("", ex);
                }
                ViewerFrameManager.removeProgressBars(progress);
            }
        }, ExportDicomLoop.class.getSimpleName() + "-" + (++threadCount)).start();
    }

    private static int threadCount = 0;

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
        final long frameRate = 1000l / fps;
        long nextFrameTime = 0;
        for (ImageLayeredData ild : frames)
        {
            sie.setData(ild);
            nextFrameTime += frameRate;
            writer.encodeVideo(index, convertToType(sie.createWholeImage(), BufferedImage.TYPE_3BYTE_BGR),
                    nextFrameTime, TimeUnit.MILLISECONDS);
            progress.setValue(progress.getValue() + 1);
        }
        writer.flush();
        writer.close();
        logger.info("export finished: " + file.getAbsolutePath());
    }

    @Override
    public ActionListener createConfigActionListener(final TargetPanel targetPanel, final OnTopDialog dialog)
    {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                // ToolConfig exportToolConfig = ExportConfig.getInstance(ExportTool.this);
                // ConfigDialog configDialog = new ConfigDialog(dialog, exportToolConfig);
                // configDialog.setVisible(true);

                // wird der Dialog beendet, wird entweder der RadioButton für die automatische oder manuelle
                // Dateinamensbildung angehakt und das Textfeld entsprechend aktualisiert
                targetPanel.setFileNameGeneration();
            }
        };
    }

    /**
     * Convert a {@link BufferedImage} of any type, to {@link BufferedImage} of a specified type. If the
     * source image is the same type as the target type, then original image is returned, otherwise new image
     * of the correct type is created and the content of the source image is copied into the new image.
     * 
     * @param sourceImage
     *            the image to be converted
     * @param targetType
     *            the desired BufferedImage type
     * 
     * @return a BufferedImage of the specifed target type.
     * 
     * @see BufferedImage
     */

    public static BufferedImage convertToType(BufferedImage sourceImage, int targetType)
    {
        // if the source image is already the target type, return the source image
        if (sourceImage.getType() == targetType)
            return sourceImage;

        // otherwise create a new image of the target type and draw the new image
        BufferedImage image = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), targetType);
        image.getGraphics().drawImage(sourceImage, 0, 0, null);

        return image;
    }

}
