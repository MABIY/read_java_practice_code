package eleven_chapters;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by lh on 17-2-6.
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how" + "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s + " " );
        }
    }
}