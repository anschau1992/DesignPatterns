package door;

//Command pattern class diagram: Receiver
public class GarageDoor {
    public void up() {
        System.out.println("Garage Door is open");
    }

    public void down() {
        System.out.println("Garage Door is closed");
    }
}
