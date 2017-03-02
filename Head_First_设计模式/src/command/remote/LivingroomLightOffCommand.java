package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class LivingroomLightOffCommand implements Command{
    private Hottub light;

    public LivingroomLightOffCommand(Hottub light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
