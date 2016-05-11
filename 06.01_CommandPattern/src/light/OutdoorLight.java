package light;

//Command pattern class diagram: Receiver
public class OutdoorLight extends Light {
    @Override
    public void on() {
        System.out.println("The Outdoor light is turned on");
    }

    @Override
    public void off() {
        System.out.println("The Outdoor light is turned off");

    }
}
