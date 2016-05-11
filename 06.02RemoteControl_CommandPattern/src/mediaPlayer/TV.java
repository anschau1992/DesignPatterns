package mediaPlayer;

/**
 * Created by Andy on 11.05.16.
 */
public class TV {
    private int channelNumber;
    private int volume;

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel(int channelNumber) {
        this.channelNumber = channelNumber;
        System.out.println("Channel is set to number " + channelNumber);

    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is set to " + volume);

    }
}
