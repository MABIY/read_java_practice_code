package command.undo;

/**
 * Created by lh on 17-3-2.
 */
public class CeilingFanLowCommand implements Command{
    private int preSpped;
    private CeilingFan ceilingFan;

    @Override
    public void execute() {
        preSpped = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if (preSpped == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpped == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpped == ceilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpped == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
