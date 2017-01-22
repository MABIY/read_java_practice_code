package eleven_chapters;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by lh on 17-1-22.
 */
public class Ex28 {
    public static void main(String[] args) {
        Random random = new Random(47);
        PriorityQueue<Double> pQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            pQueue.offer(random.nextDouble() * i);
        }
        while (pQueue.peek() != null) {
            System.out.println(pQueue.poll() + "");
        }
    }
}
