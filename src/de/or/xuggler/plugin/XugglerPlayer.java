package de.or.xuggler.plugin;

/*******************************************************************************
 1 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *
 * This file is part of Xuggle-Xuggler-Main.
 *
 * Xuggle-Xuggler-Main is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Xuggler-Main is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Xuggler-Main.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import de.or.utils.icons.JSVGIcon;
import de.or.utils.logging.LoggingTools;

public class XugglerPlayer extends JPanel {

    private static final int ICON_SIZE = 24;

    final VideoPanel screen;

    boolean isMute = false;

    boolean isStopped = false;

    VideoPlayer videoPlayer = null;

    public XugglerPlayer()
    {
        createControls();
        screen = new VideoPanel();
        screen.setPreferredSize(new Dimension(700, 600));
        setLayout(new BorderLayout());

        add(screen, BorderLayout.CENTER);
        add(createSimpleControls(), BorderLayout.SOUTH);
    }

    private JPanel createSimpleControls()
    {

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.add(createVolumeSliderPanel(), BorderLayout.EAST);
        panel.add(videoProgress, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new BorderLayout(10, 10));
        controlPanel.add(createPlayButton(), BorderLayout.WEST);
        controlPanel.add(panel, BorderLayout.CENTER);
        controlPanel.add(createMuteButton(), BorderLayout.EAST);

        return controlPanel;
    }

    private JPanel createControls()
    {
        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent evt)
            {
                if (videoPlayer != null)
                    videoPlayer.updateTimeModel();
            }
        });

        JPanel buttonPanel = new JPanel(new GridBagLayout());

        addToButtonPanel(buttonPanel, createPlayButton(), 1, 3, new Insets(1, 0, 1, 1));
        addToButtonPanel(buttonPanel, createMuteButton(), 7, 3, new Insets(1, 0, 1, 1));
        addToButtonPanel(buttonPanel, createFastButton(), 3, 3, new Insets(1, 0, 1, 1));
        addToButtonPanel(buttonPanel, createSlowButton(), 0, 3, new Insets(1, 0, 1, 1));
        addToButtonPanel(buttonPanel, new JButton(snapshotIcon), 5, 3, new Insets(1, 0, 1, 1));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(createVolumeSliderPanel(), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.WEST);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(createVideoControlPanel());
        controlPanel.add(panel);

        JPanel mainControlPanel = new JPanel();
        mainControlPanel.setLayout(new BoxLayout(mainControlPanel, BoxLayout.Y_AXIS));
        mainControlPanel.add(controlPanel);

        return mainControlPanel;
    }

    protected JPanel createVideoControlPanel()
    {
        videoControlSlider.setMajorTickSpacing(10);
        videoControlSlider.setMinorTickSpacing(5);
        videoControlSlider.setPaintTicks(true);
        videoControlSlider.setValue(0);
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new BorderLayout());
        jPanel5.add(videoControlSlider, BorderLayout.CENTER);
        return jPanel5;
    }

    protected JPanel createVolumeSliderPanel()
    {
        volumeSlider.setMajorTickSpacing(20);
        volumeSlider.setMaximum(100);
        volumeSlider.setMinorTickSpacing(10);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setToolTipText("");
        volumeSlider.setValue(50);
        volumeSlider.setMinimumSize(new Dimension(36, 30));
        volumeSlider.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent evt)
            {
                if (videoPlayer != null)
                    videoPlayer.setVolume(volumeSlider.getValue());
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.add(volumeSlider);
        return panel;
    }

    protected void addToButtonPanel(JPanel buttonPanel, AbstractButton b, int x, int y, Insets insets)
    {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.insets = insets;
        buttonPanel.add(b, gridBagConstraints);
    }

    protected JButton createSlowButton()
    {
        JButton slow = new JButton(seekBackwardIcon);
        // TODO implement function
        return slow;
    }

    protected JButton createFastButton()
    {
        final JButton fast = new JButton(seekForwardIcon);
        fast.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (videoPlayer == null)
                    return;
                videoPlayer.setPlaybackMultiplier(videoPlayer.getPlaybackMultiplier() * 2);

            }
        });
        return fast;
    }

    protected JButton createPlayButton()
    {
        if (playButton == null)
        {
            playButton = new JButton();
            playButton.setIcon(pauseIcon);
            playButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent evt)
                {
                    togglePlayMode();
                }
            });
        }
        return playButton;
    }

    protected JToggleButton createMuteButton()
    {
        if (muteButton == null)
        {
            muteButton = new JToggleButton();
            muteButton.setIcon(audioVolumeMediumIcon);
            muteButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent evt)
                {
                    isMute = !isMute;
                    if (videoPlayer != null)
                        videoPlayer.setMute(isMute);
                    setIconForMuteButton();
                }
            });
        }
        return muteButton;
    }

    void jump()
    {
        if (videoPlayer != null)
            videoPlayer.seekTo(videoControlSlider.getValue());
    }

    public static void main(String args[])
    {
        LoggingTools.initLogger();
        final JFrame frame = new JFrame();
        final JFileChooser fileChooser = new JFileChooser();
        final XugglerPlayer player = new XugglerPlayer();
        frame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_F3)
                {
                    if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
                    {
                        String filename = fileChooser.getSelectedFile().getAbsolutePath();
                        player.showVideo(filename);
                    }
                }
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
        {
            String filename = fileChooser.getSelectedFile().getAbsolutePath();
            player.showVideo(filename);
            frame.getContentPane().add(player);
            frame.setBounds(100, 100, 900, 700);
            frame.setVisible(true);
        }
    }

    String videoFilename;

    public void showVideo(final String filename)
    {
        this.videoFilename = filename;
        SwingUtilities.invokeLater(new Runnable() {

            public void run()
            {
                new Thread(new Runnable() {

                    public void run()
                    {
                        togglePlayMode();
                        videoPlayer = new VideoPlayer(filename, screen);
                        videoControlSlider.setModel(videoPlayer.getTimeModel());
                        videoPlayer.getTimeModel().addProgressBar(videoProgress);
                        videoPlayer.getTimeModel().addChangeListener(new ChangeListener() {

                            boolean manual = false;

                            public void stateChanged(ChangeEvent e)
                            {
                                if (videoPlayer.getTimeModel().getValueIsAdjusting())
                                    manual = true;
                                else if (manual)
                                {
                                    jump();
                                    manual = false;
                                }
                            }
                        });
                        final DefaultBoundedRangeModel volumeModel = videoPlayer.getVolumeModel();
                        volumeModel.addChangeListener(new ChangeListener() {

                            public void stateChanged(ChangeEvent e)
                            {
                                setIconForMuteButton();
                            }
                        });
                        volumeSlider.setModel(volumeModel);
                        if (!isStopped)
                            videoPlayer.startPlayback();
                        videoPlayer.dispose();
                        showVideo(filename);
                    }
                }).start();
            }
        });
    }

    protected void setIconForMuteButton()
    {
        int value = volumeSlider.getValue();
        if (isMute || value == 0)
            muteButton.setIcon(audioVolumeMutedIcon);
        else if (value < 34)
            muteButton.setIcon(audioVolumeLowIcon);
        else if (value < 67)
            muteButton.setIcon(audioVolumeMediumIcon);
        else
            muteButton.setIcon(audioVolumeHighIcon);
    }

    protected void togglePlayMode()
    {
        if (videoPlayer == null)
            return;
        videoPlayer.setPlaybackMultiplier(1);
        if (isStopped == true)
        {
            playButton.setIcon(pauseIcon);
        } else
        {
            videoPlayer.resetDelay();
            playButton.setIcon(playIcon);
        }
        isStopped = !isStopped;
        videoPlayer.setStopped(isStopped);
    }

    JSlider videoControlSlider = new JSlider();

    JProgressBar videoProgress = new JProgressBar();

    JSlider volumeSlider = new JSlider();

    final JSVGIcon pauseIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-media-playback-pause.svg"));

    final JSVGIcon playIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-media-playback-start.svg"));

    final JSVGIcon audioVolumeHighIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-audio-volume-high.svg"));

    final JSVGIcon audioVolumeLowIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-audio-volume-low.svg"));

    final JSVGIcon audioVolumeMediumIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-audio-volume-medium.svg"));

    final JSVGIcon audioVolumeMutedIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-audio-volume-muted.svg"));

    final JSVGIcon snapshotIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-camera-photo.svg"));

    final JSVGIcon seekBackwardIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-media-seek-backward.svg"));

    final JSVGIcon seekForwardIcon = new JSVGIcon(ICON_SIZE, ICON_SIZE, getClass().getResourceAsStream(
            "Gnome-media-seek-forward.svg"));

    JToggleButton muteButton;

    protected JButton playButton;

}