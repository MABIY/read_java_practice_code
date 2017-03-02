package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class GarageDoorUpCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
