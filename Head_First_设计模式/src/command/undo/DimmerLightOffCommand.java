package command.undo;

/**
 * Created by lh on 17-3-2.
 */
public class DimmerLightOffCommand implements Command{
    private int prevLevel;
    private Light light;

    @Override
    public void execute() {
        prevLevel = light.getLevel();
    }

    @Override
    public void undo() {

    }
}
