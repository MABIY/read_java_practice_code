package eleven_chapters;

import java.util.Arrays;

/**
 * Created by lh on 17-2-6.
 */
public class ArrayNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // An array works in foreach, but it'st not iterable;
        // ! test(strings)
        //  You must explicitly convert it to an iterable;
        test(Arrays.asList(strings));
    }
}
