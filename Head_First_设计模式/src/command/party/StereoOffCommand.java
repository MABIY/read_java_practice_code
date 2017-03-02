package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class StereoOffCommand implements Command{
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
