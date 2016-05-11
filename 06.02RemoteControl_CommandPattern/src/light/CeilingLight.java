package light;

public class CeilingLight extends Light {
    @Override
    public void on() {
        System.out.println("CeilingLight is turned on");
    }

    @Override
    public void off() {
        System.out.println("CeilingLight is turned off");
    }

    public void dim() {
        System.out.println("CeilingLight is dimed");

    }
}
