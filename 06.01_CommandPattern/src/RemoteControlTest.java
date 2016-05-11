import command.GarageDoorOpenCommand;
import command.LightOnCommand;
import door.GarageDoor;
import light.Light;
import light.OutdoorLight;

//Command pattern class diagram: Client
public class RemoteControlTest {
    public static void main (String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light outdoorLight = new OutdoorLight();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(outdoorLight);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
