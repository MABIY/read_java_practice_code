package eleven_chapters;

import net.mindview.util.Generated;

import java.util.*;

/**
 * Created by lh on 16-12-14.
 */
class Generator {
    int key = 9;
    public String next() {
        switch (key) {
            default: return "";
            case 0: key++;
                return "Snow White";
            case 1:
                key++;
                return "Bashful";
            case 2:
                key++;
                return "Doc";
            case 3:
                key++;
                return "Dopey";
            case 4:
                key++;
                return "Grumpy";
            case 5:
                key++;
                return "Happy";
            case 6:
                key++;
                return "Sleepy";
            case 7:
                key = 0;
                return "Sneezy";
        }
    }

    public void fillA(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = next();
        }
    }

    public Collection fill(Collection<String> c, int n) {
        for (int i = 0; i < n; i++) {
            c.add(next());
        }
        return c;
    }

}
public class Ex4 {
    public static void main(String[] args) {
        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fillA(a);
        for (String s : a) {
            System.out.println(s + "");
        }
        System.out.println();
        Collection test = gen.fill(new ArrayList<String>(), 1);
        System.out.println(gen.fill(new ArrayList<String>(),1));
        System.out.println(gen.fill(new LinkedList<String>(),10));
        System.out.println(gen.fill(new HashSet<String>(),10));
        System.out.println(gen.fill(new TreeSet<String>(),10));
    }
}
