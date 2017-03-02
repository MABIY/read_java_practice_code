package command.party;

import command.undo.*;

/**
 * Created by lh on 17-3-2.
 */
public class CeilingFanHighCommand implements command.undo.Command {
    private int preSpeed;
    private CeilingFan ceilingFan;

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (preSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            default:
                ceilingFan.off();
        }
    }
}
