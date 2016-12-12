package eleven_chapters;

import java.util.*;

/**
 * Created by lh on 16-12-12.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        //Runs significantly faster,but you can't
        //construct a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 14);
        Collections.addAll(collection, moreInts);
        //Produces a list "backed by " an arrayV:
        List<Integer> list = Arrays.asList(moreInts);
        list.set(1, 99);  // ok  -- modify an element
        list.add(21); // Runtime error because the  underlying array cannot be resized

    }
}
