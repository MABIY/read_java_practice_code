package command.undo;

/**
 * Created by lh on 17-3-2.
 */
public class LightOffCommand implements Command{
    private int level;
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
