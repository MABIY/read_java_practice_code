package eleven_chapters;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by lh on 17-1-16.
 */
public class QueueDemo {
    private static void printQ(Queue queue) {
        while (queue.peek()!=null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
