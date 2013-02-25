/**
 * 
 */
package de.or.xuggler.plugin;

import de.or.dicom.viewer.data.DisplayableUnit;
import de.or.dicom.viewer.data.Instance;
import de.or.dicom.viewer.dataBase.io.ArchiveData.FileType;
import de.or.dicom.viewer.displaymodel.MatrixModel;
import de.or.dicom.viewer.navigation.EmptyNavigator;
import de.or.dicom.viewer.navigation.INavigator;
import de.or.plugin.images.DisplayComponentContainer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

/**
 */
public class XugglerContainer extends JPanel implements DisplayComponentContainer {

    XugglerPlayer player;

    public XugglerContainer()
    {
        super(new BorderLayout());
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
    public Component getDisplayComponent()
    {
        return this;
    }

    @Override
    public void setActive(boolean active)
    {
        // TODO Auto-generated method stub
    }

    public void setToolCursor(Cursor cursor)
    {// Do nothing, we dont show tool cursor on videos
    }

}
