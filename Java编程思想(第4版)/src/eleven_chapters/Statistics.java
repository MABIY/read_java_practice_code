package eleven_chapters;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by lh on 17-1-7.
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            //produce a number between o and 20
            int r = rand.nextInt(20);
            Integer freg = m.get(r);
            m.put(r, freg == null ? 1 : freg + 1);
        }
        System.out.println(m);
    }
}
