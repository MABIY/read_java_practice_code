package command.party;

/**
 * Created by lh on 17-3-2.
 */
public interface Command {
    void execute();

    void undo();
}
