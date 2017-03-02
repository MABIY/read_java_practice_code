package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class HottubOnCommand implements Command{
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubbiesOn();
    }
}
