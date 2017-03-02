package command.undo;

/**
 * Created by lh on 17-3-2.
 */
public class LightOnCommand implements Command{
    private int level;
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
