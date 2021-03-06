package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class LightOnCommand  implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light = light;
    }

    @Override
    public void undo() {
        light.off();
    }
}
