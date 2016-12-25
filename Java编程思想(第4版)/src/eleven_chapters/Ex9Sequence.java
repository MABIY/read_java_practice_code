package eleven_chapters;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lh on 16-12-25.
 */
public class Ex9Sequence {
    private ArrayList<Object> items = new ArrayList<>();

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Ex9Sequence ex9Sequence = new Ex9Sequence();
        for (int i = 0; i < 10; i++) {
            ex9Sequence.add(Integer.toString(i));
        }
        Iterator it = ex9Sequence.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}
