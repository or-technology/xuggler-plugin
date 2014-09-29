package de.or.xuggler.plugin;

import de.or.dicom.dcm.codec.DcmDataObject;
import de.or.dicom.viewer.tools.Tool;
import de.or.plugin.PluginCentral;
import de.or.plugin.core.DisplayPlugin;
import de.or.plugin.core.ToolPlugin;
import de.or.plugin.images.DisplayComponentContainer;
import de.or.plugin.registry.ToolPluginRegistry;
import de.or.plugin.registry.VideoPluginRegistry;
import de.or.utils.Version;
import de.or.xuggler.plugin.tools.ExportDicomLoop;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.java.plugin.Plugin;
import org.java.plugin.PluginClassLoader;

import com.xuggle.xuggler.ICodec;

public class XugglerPlugin extends Plugin implements DisplayPlugin, ToolPlugin {

    public static final String PLUGIN_XUGGLER_VERSION_PROPERTIES = "dicomPACSXugglerVersion.properties";

    protected static final Logger LOGGER = Logger.getLogger(XugglerPlugin.class);

    protected Version pluginVersion = null;

    public XugglerPlugin()
    {
        super();
    }

    public Version getPluginVersion()
    {
        if (pluginVersion == null)
            try (PluginClassLoader pcl = PluginCentral.getPluginCentral()
                    .getPluginManager()
                    .getPluginClassLoader(getDescriptor());
                    InputStream is = pcl.getResourceAsStream(PLUGIN_XUGGLER_VERSION_PROPERTIES))
            {
                pluginVersion = new Version(is);
                is.close();
            } catch (Exception e)
            {
                LOGGER.warn("", e);
            }
        return pluginVersion;
    }

    // Plugin Name wird festgelegt
    public String getPluginName()
    {
        return "Xuggler Plugin";
    }

    @Override
    protected void doStart() throws Exception
    {
        if (LOGGER.isDebugEnabled())
            logInstalledCodes();
        VideoPluginRegistry.getInstance().addPlugin(this);
        ToolPluginRegistry.getInstance().addPlugin(this);
    }

    protected static void logInstalledCodes()
    {
        LOGGER.debug("INSTALLED CODEC INFO");
        for (ICodec codec : ICodec.getInstalledCodecs())
            if (codec.getType() == ICodec.Type.CODEC_TYPE_VIDEO)
                LOGGER.debug("codec: " + codec.getLongName() + " supported" + codec.canDecode());
    }

    @Override
    protected void doStop() throws Exception
    {
        VideoPluginRegistry.getInstance().removePlugin(this);
        ToolPluginRegistry.getInstance().removePlugin(this);
    }

    @Override
    public boolean canDisplay(DcmDataObject dcmDataObject)
    {
        String transferSyntax = dcmDataObject.getTransferSyntax();

        if (transferSyntax.equals("1.2.840.10008.1.2.4.100"))
            return true;
        if (transferSyntax.equals("1.2.840.10008.1.2.4.101"))
            return true;
        if (transferSyntax.equals("1.2.840.10008.1.2.4.102"))
            return true;
        if (transferSyntax.equals("1.2.840.10008.1.2.4.103"))
            return true;

        return false;
    }

    @Override
    public DisplayComponentContainer createDisplayComponentContainer()
    {
        return new XugglerContainer();
    }

    public String getToolGroupID()
    {
        return "1";
    }

    public String getToolMenuID()
    {
        return "Bildaufnahme/-ausgabe";
    }

    public Tool createTool()
    {
        return new ExportDicomLoop();
    }

}
