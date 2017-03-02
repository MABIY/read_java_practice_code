package command.undo;

/**
 * Created by lh on 17-3-2.
 */
public class DimmerLightOnCommand  implements Command{
    private int prevLevel;
    private Light light;

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
