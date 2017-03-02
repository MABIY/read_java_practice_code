package command.party;

import command.undo.*;

/**
 * Created by lh on 17-3-2.
 */
public class CeilingFanOffCommand implements command.undo.Command {
    private int prevSpeed;
    private CeilingFan ceilingFan;

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
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
                break;
        }
    }
}
