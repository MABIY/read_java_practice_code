package command.remote;

/**
 * Created by lh on 17-3-2.
 */
public class StereoOnWithCDCommand  implements Command{
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
