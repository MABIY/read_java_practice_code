package eleven_chapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by lh on 16-12-12.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(Arrays.asList(1,2));
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.println(i + " , ");
        }

    }
}
