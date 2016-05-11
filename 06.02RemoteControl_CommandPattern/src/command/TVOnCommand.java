package command;

import mediaPlayer.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
        tv.setVolume(15);
        tv.setInputChannel(1);
    }
}
