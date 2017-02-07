package eleven_chapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by lh on 17-2-7.
 */
class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }

}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList(("To be or not to").split(" ")));
        // Grabs the ordinary iterator via iterator();
        for (String s : ral) {
            System.out.println(s + " ");
        }
        //Hand it the Iterable  of your choice
        System.out.println();
        for (String s : ral.reversed()) {
            System.out.println(s + " ");
        }
    }
}
