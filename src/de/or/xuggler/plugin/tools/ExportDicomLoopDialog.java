/**
 * 
 */
package de.or.xuggler.plugin.tools;

import de.or.dicom.viewer.control.FontChanger;
import de.or.dicom.viewer.dialog.OnTopDialog;
import de.or.dicom.viewer.dialog.SelectionPanel;
import de.or.dicom.viewer.dialog.StandardSelectionDialog;
import de.or.dicom.viewer.dialog.TargetPanel;
import de.or.dicom.viewer.tasks.ExportTask;
import de.or.gui.util.VerticalLayout;
import de.or.utils.config.Config;
import de.or.utils.config.FontConfig;
import de.or.utils.config.LocalesConfig;
import de.or.utils.icons.IconRegistry;
import de.or.xuggler.plugin.icons.UbuntuStudioIconsVideoProductionIcon;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import org.apache.log4j.Logger;

import com.xuggle.xuggler.ICodec;

/**
 * @author till.woitendorf
 * 
 *         28.08.2013<BR>
 *         Project: dicomPACSXuggler (trunk)<BR>
 *         Package: de.or.xuggler.plugin.tools<BR>
 *         Copyright Oehm und Rehbein GmbH<BR>
 */
public class ExportDicomLoopDialog extends StandardSelectionDialog {

    private static final Logger LOGGER = Logger.getLogger(ExportDicomLoopDialog.class);

    TargetPanel targetPanel;

    public ExportDicomLoopDialog(JFrame frame, ExportTask task, ExportDicomLoop tool)
    {
        super(frame);
        this.exportTask = task;
        this.exportDicomLoop = tool;
        setTitle(LocalesConfig.getString("ExportDialog.Title", "Bilder exportieren"));
        getContentPane().add(getMainPanel());
        pack();
        setLocationRelativeTo(frame);
        new FontChanger(this, FontConfig.getFontWidthHeight(12), FontConfig.getFontWidthHeight(12)
                .deriveFont(Font.BOLD));
        addDialogListener();
    }

    private ExportTask exportTask;

    private ExportDicomLoop exportDicomLoop;

    protected ExportTask getExportTask()
    {
        if (exportTask == null)
            exportTask = new ExportTask();
        return exportTask;
    }

    @Override
    public SelectionPanel getImageSelection()
    {
        if (imageSelection == null)
        {
            String selectionInfo = LocalesConfig.getString("ExportDialog.SelectionPanel.Title",
                    "Bitte w\u00E4hlen Sie die zu exportiernden Bilder");
            imageSelection = createImageSelection(selectionInfo, false);
            imageSelection.setTask(getExportTask());
            imageSelection.removeResultButtons();
            imageSelection.selectImages();
        }
        return imageSelection;
    }

    private JPanel getMainPanel()
    {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel p = new JPanel(new VerticalLayout(10, VerticalLayout.BOTH));
        p.add(getInfoPanel());
        p.add(getImageSelection());
        mainPanel.add(p, BorderLayout.NORTH);
        p = new JPanel(new VerticalLayout(10, VerticalLayout.BOTH));
        targetPanel = new TargetPanel(this, getExportTask(), exportDicomLoop);
        p.add(targetPanel);
        p.add(getFormatAndOptionPanel());
        mainPanel.add(p, BorderLayout.CENTER);
        mainPanel.add(getButtonPanel(), BorderLayout.SOUTH);
        return mainPanel;
    }

    @Override
    public javax.swing.AbstractButton getGoButton()
    {
        if (goButton == null)
        {
            AbstractButton button = super.getGoButton();
            button.setIcon(IconRegistry.getIcon(UbuntuStudioIconsVideoProductionIcon.class.getName(),
                    Config.getInteger("MakeCopyDialog.CloseIconSize", 32), getClass().getClassLoader()));
            button.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e)
                {
                    setActionCommand("Export");
                    setVisible(false);
                }
            });
        }
        return goButton;
    }

    ExportVideoFormat currentSelectedCodec = null;

    private final ButtonGroup videoFormatButtonGroup = new ButtonGroup();

    private JSlider fps;

    private JPanel getFormatAndOptionPanel()
    {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ExportVideoFormat[] formats = {
            new ExportVideoFormat(ICodec.ID.CODEC_ID_MPEG2VIDEO, "mpg", "MPG2"),
            new ExportVideoFormat(ICodec.ID.CODEC_ID_MPEG4, "mp4", "MPG4"),
            new ExportVideoFormat(ICodec.ID.CODEC_ID_H264, "h264", "H264") };
        for (final ExportVideoFormat evf : formats)
        {
            final ICodec codec = evf.codec;
            if (codec != null)
            {
                JRadioButton radio = new JRadioButton(new AbstractAction(evf.name) {

                    public void actionPerformed(ActionEvent e)
                    {
                        currentSelectedCodec = evf;
                    }
                });
                videoFormatButtonGroup.add(radio);
                panel.add(radio);
                if (currentSelectedCodec == null)
                {
                    currentSelectedCodec = evf;
                    radio.setSelected(true);
                }
            }
        }

        JPanel formatAndOptionPanel = new JPanel();
        formatAndOptionPanel.setLayout(new BoxLayout(formatAndOptionPanel, BoxLayout.PAGE_AXIS));
        formatAndOptionPanel.add(panel);

        formatAndOptionPanel.add(createFramesPerSecondChoser());

        return formatAndOptionPanel;
    }

    private JPanel createFramesPerSecondChoser()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Bitte wählen Sie die Bildwiederholrate: "));
        panel.add(getFpsSlider());
        return panel;
    }

    private JSlider getFpsSlider()
    {
        if (fps == null)
        {
            fps = new JSlider(1, 100, 25);
            fps.setPaintTicks(true);
        }
        return fps;
    }

    protected JPanel createVideoCodecChooser()
    {
        final JComboBox<ICodec> comboBox = new JComboBox<>(getInstalledVideoCodecs());
        final JRadioButton comboRadio = new JRadioButton(new AbstractAction(LocalesConfig.getString(
                "ExportDicomLoopDialog.OtherVideoFormat", "anderes Format")) {

            public void actionPerformed(ActionEvent e)
            {
                ICodec item = (ICodec) comboBox.getSelectedItem();
                currentSelectedCodec = new ExportVideoFormat(item.getID(), "*.mpg", item.getName());
            }
        });
        videoFormatButtonGroup.add(comboRadio);
        comboBox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                ICodec item = (ICodec) comboBox.getSelectedItem();
                currentSelectedCodec = new ExportVideoFormat(item.getID(), "*.mpg", item.getName());
            }
        });
        comboBox.setRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus)
            {
                String stringValue = value == null ? "" : value.toString();
                if (value instanceof ICodec)
                {
                    ICodec codec = (ICodec) value;
                    stringValue = codec.getLongName();
                }
                return super.getListCellRendererComponent(list, stringValue, index, isSelected, cellHasFocus);
            }
        });
        comboRadio.add(comboBox);
        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        comboPanel.setLayout(new BoxLayout(comboPanel, BoxLayout.LINE_AXIS));
        comboPanel.add(comboRadio);
        comboPanel.add(comboBox);
        return comboPanel;
    }

    private Vector<ICodec> getInstalledVideoCodecs()
    {
        Vector<ICodec> vector = new Vector<>();
        for (ICodec codec : ICodec.getInstalledCodecs())
            if (codec.getType() == ICodec.Type.CODEC_TYPE_VIDEO && codec.canEncode())
                vector.add(codec);
        return vector;
    }

    private JPanel getInfoPanel()
    {
        JPanel infoPanel = new JPanel(new BorderLayout(25, 0));
        infoPanel.add(
                new JLabel(IconRegistry.getIcon(UbuntuStudioIconsVideoProductionIcon.class.getName(), 64,
                        getClass().getClassLoader())), BorderLayout.WEST);
        infoPanel.add(getInfoTextLabel(), BorderLayout.CENTER);
        return infoPanel;
    }

    private JLabel getInfoTextLabel()
    {
        JLabel infoTextLabel = new JLabel();
        String[] lines = {
            "Sie k\u00F6nnen Bildstapel als Video exportieren, ",
            "verwendet wird dabei der aktuelle Bildausschnitt inkl. Bildbearbeitung" };
        String text = "";
        int i = 1;
        for (String string : lines)
            if (!(string.startsWith("!") && string.endsWith("!")))
                text += LocalesConfig.getString("ExportDicomLoopDialog.Info.Line" + i++, string)
                        + OnTopDialog.HTML_BR;
        infoTextLabel.setFont(FontConfig.getFont(getOwner()));
        infoTextLabel.setText(OnTopDialog.HTML_START + text + OnTopDialog.HTML_END);
        return infoTextLabel;
    }

    public ExportVideoFormat getSelectedCodec()
    {
        return currentSelectedCodec;
    }

    public int getSelectedFrameRate()
    {
        return getFpsSlider().getValue();
    }
}
