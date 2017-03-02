package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class LivingroomLightOnCommand implements Command{
    private Light light;

    @Override
    public void execute() {
        this.light = light;
    }

    @Override
    public void undo() {
        light.off();
    }

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }
}
