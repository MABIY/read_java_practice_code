package eleven_chapters;

import javax.activation.CommandMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lh on 17-1-16.
 */
class Command {
    String s;

    Command(String s) {
        this.s = s;
    }

    void operation() {
        System.out.print(s);
    }
}

class Build {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.offer(new Command(i + " "));
        }
        return q;
    }
}

public class Ex27 {
    public static void commandEater(Queue<Command> qc) {
        while (qc.peek() != null) {
            qc.poll().operation();
        }
    }

    public static void main(String[] args) {
        Build b = new Build();
        commandEater(b.makeQ());
    }
}
