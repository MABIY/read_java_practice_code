package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class TVOffCommand implements Command{
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
