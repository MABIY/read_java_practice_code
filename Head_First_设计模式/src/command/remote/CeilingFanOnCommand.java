package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class CeilingFanOnCommand implements Command {
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    CeilingFan ceilingFan;

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
