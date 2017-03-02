package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.off();
    }
}
