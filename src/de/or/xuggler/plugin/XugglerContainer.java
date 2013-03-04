/**
 * 
 */
package de.or.xuggler.plugin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import org.apache.log4j.Logger;

import de.or.dicom.viewer.data.DisplayableUnit;
import de.or.dicom.viewer.data.Instance;
import de.or.dicom.viewer.dataBase.io.ArchiveData.FileType;
import de.or.dicom.viewer.displaymodel.MatrixModel;
import de.or.dicom.viewer.navigation.EmptyNavigator;
import de.or.dicom.viewer.navigation.INavigator;
import de.or.plugin.images.AbstractDisplayComponentContainer;

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
            {
                try
                {
                    String path = instance.getArchiveData().getAbsolutePath(FileType.Video);
                    player = new XugglerPlayer();
                    add(player, BorderLayout.CENTER);
                    player.showVideo(path);
                } catch (Exception e)
                {
                    Logger.getLogger(XugglerContainer.class).warn("", e);
                }
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
