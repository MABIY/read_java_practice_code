package eleven_chapters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lh on 16-12-23.
 */
class Tester {
    public static int counter = 0;
    private int id = counter++;

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Tester[] t = new Tester[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tester();
        }
        List<Tester> lt = new ArrayList<>();
        Collections.addAll(lt, t);
        System.out.println("List of Tester" + lt);
        List<Tester> sub = lt.subList(2, 6);
        System.out.println("subList" + sub);
        // prducdes run time ConcurrentModificationException
//        lt.removeAll(sub);
//       sub.remove(1);
        //so ,first make copy ,remove sub, re-assign it;
        List<Tester> copy = new ArrayList<Tester>(lt);
        copy.removeAll(sub);
        lt = copy;
        System.out.println("list of Tester: " + lt);

    }
}
