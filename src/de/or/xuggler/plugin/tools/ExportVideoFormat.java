/**
 * 
 */
package de.or.xuggler.plugin.tools;

import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.ICodec.ID;

/**
 * @author till.woitendorf
 * 
 *         30.08.2013<BR>
 *         Project: dicomPACSXuggler (trunk)<BR>
 *         Package: de.or.xuggler.plugin.tools<BR>
 *         Copyright Oehm und Rehbein GmbH<BR>
 */
public class ExportVideoFormat {

    public ExportVideoFormat(ID codecId, String fileExtension, String name)
    {
        this.codec = ICodec.findEncodingCodec(codecId);
        this.fileExtension = fileExtension;
        this.name = name;
    }

    protected String name;

    protected ICodec codec;

    protected String fileExtension;

}
