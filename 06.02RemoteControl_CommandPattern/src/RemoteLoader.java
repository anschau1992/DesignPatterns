import command.*;
import light.CeilingLight;
import light.Light;
import light.OutdoorLight;
import mediaPlayer.Stereo;
import mediaPlayer.TV;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //setup Objects
        Light outdoorLight = new OutdoorLight();
        Light ceilingLight = new CeilingLight();
        Stereo stereo = new Stereo();
        TV tv = new TV();

        //light command
        LightOnCommand outdoorLightOn = new LightOnCommand(outdoorLight);
        LightOffCommand outdoorLightOff = new LightOffCommand(outdoorLight);
        LightOnCommand ceilingLightOn = new LightOnCommand(ceilingLight);
        LightOffCommand ceilingLightOff = new LightOffCommand(ceilingLight);

        //multimedia command
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        //install commands on specific place of remote control
        remoteControl.setCommand(0, outdoorLightOn, outdoorLightOff);
        remoteControl.setCommand(1, ceilingLightOn, ceilingLightOff);
        remoteControl.setCommand(2, tvOn, tvOff);
        remoteControl.setCommand(3, stereoOn, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

    }
}
