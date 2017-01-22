package eleven_chapters;

import java.util.PriorityQueue;

/**
 * Created by lh on 17-1-22.
 */
class OnlyObject {

}
public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        for (int i = 0; i < 10; i++) {
            OnlyObject onlyObject = new OnlyObject();
            priorityQueue.offer(onlyObject);
        }
    }
}
