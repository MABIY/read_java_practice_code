package command.simpleremoteWL;

/**
 * Created by lh on 17-3-2.
 */
public class SimpleRemoteControl {
    Command slot ;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
