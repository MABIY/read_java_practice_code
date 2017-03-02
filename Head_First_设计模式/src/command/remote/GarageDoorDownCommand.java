package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class GarageDoorDownCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
