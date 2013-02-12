package de.or.xuggler.plugin;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import com.xuggle.xuggler.IAudioSamples;
import com.xuggle.xuggler.IStreamCoder;

public class SoundPlayer {

    private SourceDataLine mLine;

    public SoundPlayer(SourceDataLine mLine)
    {
        this.mLine = mLine;
    }

    public SoundPlayer()
    {
    }

    public void openJavaSound(IStreamCoder aAudioCoder,int volume) throws LineUnavailableException {
        AudioFormat audioFormat = new AudioFormat(aAudioCoder.getSampleRate(),
                (int) IAudioSamples.findSampleBitDepth(aAudioCoder.getSampleFormat()),
                aAudioCoder.getChannels(),
                true,
                false);

        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        mLine = (SourceDataLine) AudioSystem.getLine(info);

        mLine.open(audioFormat);
        mLine.start();

        setVolume(volume);
    }

    public void setVolume(int volume) {
        if(mLine == null) return;

        FloatControl volctrl=(FloatControl)mLine.getControl(FloatControl.Type.MASTER_GAIN);

        float max_slider_value = 100F;
        float vol = volume/max_slider_value;
        float dB = (float)(Math.log(vol == 0.0F ? 0.0001F : vol)/Math.log(10.0)*20.0);

        volctrl.setValue(dB);
    }

    public void playJavaSound(IAudioSamples aSamples) {
        byte[] rawBytes = aSamples.getData().getByteArray(0, aSamples.getSize());
        mLine.write(rawBytes, 0, aSamples.getSize());
    }

    public void closeJavaSound() {
        if(mLine != null) {
            mLine.drain();
            mLine.close();
            mLine = null;
        }
    }
}
