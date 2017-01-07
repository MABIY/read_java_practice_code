package eleven_chapters;

import java.util.*;

/**
 * Created by lh on 17-1-7.
 */
class Gerbil18 {
    private int gerbilNumber;

    public Gerbil18(int i) {
        gerbilNumber = 1;
    }

    public void hop() {
        System.out.println("gerbil " + gerbilNumber + " hop");
    }
}
public class Ex18 {
    public static void main(String[] args) {
        Map<String, Gerbil18> gerbils = new HashMap<>();
        gerbils.put("Fuzzy", new Gerbil18(0));
        gerbils.put("Spot", new Gerbil18(1));
        gerbils.put("Speedy", new Gerbil18(2));
        gerbils.put("Dopey", new Gerbil18(3));
        gerbils.put("Sleepy", new Gerbil18(4));
        gerbils.put("Haapy", new Gerbil18(5));
        gerbils.put("Funny", new Gerbil18(6));
        gerbils.put("Silly", new Gerbil18(7));
        gerbils.put("Googy", new Gerbil18(8));
        gerbils.put("Wowee", new Gerbil18(9));
        System.out.println(gerbils);
        System.out.println();
        Set<String> sortedKeys = new TreeSet<String>(gerbils.keySet());
        System.out.println(sortedKeys);
        System.out.println();
        Map<String, Gerbil18> sortedGerbils = new LinkedHashMap<>();
        for (String s : sortedKeys) {
            System.out.println("Adding " + s + ", ");
            sortedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println(sortedGerbils);
        System.out.println();
        // or , just:
        Map<String, Gerbil18> sortedGerbils2 = new TreeMap<>(gerbils);
        System.out.println(sortedGerbils2);
    }
}
