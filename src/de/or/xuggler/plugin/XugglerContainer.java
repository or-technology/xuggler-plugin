/**
 * 
 */
package de.or.xuggler.plugin;

import de.or.dicom.dcm.codec.DcmConstants.TagName;
import de.or.dicom.dcm.codec.DcmDataObject;
import de.or.dicom.viewer.data.DisplayableUnit;
import de.or.dicom.viewer.data.Instance;
import de.or.dicom.viewer.dataBase.io.ArchiveData.FileType;
import de.or.dicom.viewer.displaymodel.MatrixModel;
import de.or.dicom.viewer.navigation.EmptyNavigator;
import de.or.dicom.viewer.navigation.INavigator;
import de.or.plugin.images.AbstractDisplayComponentContainer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import org.apache.log4j.Logger;

/**
 */
public class XugglerContainer extends AbstractDisplayComponentContainer {

    XugglerPlayer player;

    public XugglerContainer()
    {
        super();
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
    }

    @Override
    public void setDisplayableUnit(DisplayableUnit unit)
    {
        removeAll();
        if (unit instanceof Instance)
        {
            Instance instance = (Instance) unit;
            if (instance.isVideo())
                try
                {
                    String path = instance.getArchiveData().getAbsolutePath(FileType.Video);
                    player = new XugglerPlayer();
                    DcmDataObject dataObject = instance.getDataObject();
                    if (dataObject.hasValue(TagName.PixelAspectRatio))
                    {
                        String[] ratioStr = dataObject.getStringArray(0x0028, 0x0034);
                        if (ratioStr.length == 2)
                            try
                            { // gleich als Double parsen, sind aber eigentlich Integer-Werte
                                double xSize = Double.parseDouble(ratioStr[0].trim());
                                double ySize = Double.parseDouble(ratioStr[1].trim());
                                double pixelAspectRatio = xSize / ySize;
                                player.setPixelAspectRatio(pixelAspectRatio);
                            } catch (NumberFormatException ex)
                            {
                                Logger.getLogger(XugglerContainer.class).debug("", ex);
                            }
                    }
                    add(player, BorderLayout.CENTER);
                    player.showVideo(path);
                } catch (Exception e)
                {
                    Logger.getLogger(XugglerContainer.class).warn("", e);
                }
        }
    }

    @Override
    public INavigator createNavigator(MatrixModel model)
    {
        return new EmptyNavigator();
    }

    @Override
    public void setToolCursor(Cursor cursor)
    {// Do nothing, we dont show tool cursor on videos
    }

}
