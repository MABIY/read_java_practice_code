package eleven_chapters;

import net.mindview.util.CountingGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by lh on 16-12-25.
 */
public class Ex12 {
    public static void main(String[] args) {
        List<Integer> baseList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ListIterator<Integer> integerListIterator = baseList.<Integer>listIterator(baseList.size());
        List<Integer> reversalList = new ArrayList<Integer>();
       while (integerListIterator.hasPrevious()) {
            reversalList.add(integerListIterator.previous());
        }
        System.out.println(reversalList);

    }
}
