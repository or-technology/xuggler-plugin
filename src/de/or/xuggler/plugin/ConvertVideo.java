package de.or.xuggler.plugin;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.ToolFactory;

public class ConvertVideo extends JPanel {

    protected static final Logger logger = Logger.getLogger(ConvertVideo.class);

    public static void main(String[] args)
    {
        if (args.length == 2)
        {

            String filename = args[0];
            try
            {

                // TODO Auto-generated method stub

                IMediaReader reader = ToolFactory.makeReader(filename);
                reader.addListener(ToolFactory.makeWriter(args[1], reader));

                System.out.println("Video wird konvertiert");

                while (reader.readPacket() == null)
                    ;

            } catch (Exception e)
            {
                logger.warn("", e);
            }
        } else
            System.err.println("need 2 parameters: source-video destination-file");

    }
}
