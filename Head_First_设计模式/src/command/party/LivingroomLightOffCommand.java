package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class LivingroomLightOffCommand implements Command{
    private Light light;

    @Override
    public void execute() {
        this.light = light;
    }

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        light.on();
    }
}
