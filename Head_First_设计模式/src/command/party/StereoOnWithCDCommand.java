package command.party;

/**
 * Created by lh on 17-3-2.
 */
public class StereoOnWithCDCommand implements Command{
    private Stereo stereo;

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
