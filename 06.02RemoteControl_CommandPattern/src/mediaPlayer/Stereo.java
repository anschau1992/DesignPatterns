package mediaPlayer;

public class Stereo {
    private int volume;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("CD is set into Stereo");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is set to " + volume);
    }
}
