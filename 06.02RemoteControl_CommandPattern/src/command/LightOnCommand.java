package command;

import command.Command;
import light.Light;

//Command pattern class diagram: ConcreteCommand
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
