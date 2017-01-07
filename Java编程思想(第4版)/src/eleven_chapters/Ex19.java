package eleven_chapters;

import java.util.*;

/**
 * Created by lh on 17-1-7.
 */
public class Ex19 {
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
        System.out.println("gerbile.keyset: " + gerbils.keySet());
        Set<String> hashedKeys = new HashSet<String>(gerbils.keySet());
        System.out.println("HashSet: " + hashedKeys);
        System.out.println();
        Map<String, Gerbil18> hashedGerbils = new LinkedHashMap<>();
        for (String s : hashedKeys) {
            System.out.println("Adding " + s + ", ");
            hashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println("From HashSet:" + hashedGerbils);

        System.out.println();
        Set<String> linkedHashedKeys = new LinkedHashSet<String>(gerbils.keySet());
        System.out.println("LinkedHashSet: " + linkedHashedKeys);
        System.out.println();
        Map<String, Gerbil18> linkedHashedGerbils = new LinkedHashMap<>();
        for (String s : linkedHashedKeys) {
            System.out.println("Adding " + s + ", "  );
            linkedHashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println("From LInkedHashSet: " + linkedHashedGerbils);
    }
}
