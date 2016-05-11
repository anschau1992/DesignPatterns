package command;

import command.Command;
import light.Light;

//Command pattern class diagram: ConcreteCommand
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
