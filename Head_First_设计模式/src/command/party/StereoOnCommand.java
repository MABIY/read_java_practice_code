package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class StereoOnCommand implements Command{
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
