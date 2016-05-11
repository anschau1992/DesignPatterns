package command;

import mediaPlayer.TV;

/**
 * Created by Andy on 11.05.16.
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.off();
    }
}
