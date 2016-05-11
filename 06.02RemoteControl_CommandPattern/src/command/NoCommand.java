package command;

/**
 * Created by Andy on 11.05.16.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("There is no Command set on this slot");
    }
}
