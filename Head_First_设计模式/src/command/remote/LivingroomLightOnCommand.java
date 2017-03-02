package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class LivingroomLightOnCommand implements Command{
    private Hottub light;

    public LivingroomLightOnCommand(Hottub light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
