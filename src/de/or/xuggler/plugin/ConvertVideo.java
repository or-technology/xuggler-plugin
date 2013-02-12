package de.or.xuggler.plugin;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.ToolFactory;

public class ConvertVideo extends JPanel {

    protected static final Logger logger = Logger.getLogger(ConvertVideo.class);

    public static void main(String[] args)
    {
        if (args.length <= 0)
        {
            throw new RuntimeException("keine Datei angegeben");
        }

        String filename = args[0];
        try
        {

            // TODO Auto-generated method stub

            IMediaReader reader = ToolFactory.makeReader(filename);
            reader.addListener(ToolFactory.makeWriter("convertVideo.flv", reader));

            System.out.println("Video wird konvertiert");

            while (reader.readPacket() == null)
                ;

        } catch (Exception e)
        {
            logger.warn("", e);

        }

    }

}
