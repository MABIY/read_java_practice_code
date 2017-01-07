package eleven_chapters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lh on 17-1-7.
 */
class Gerbil17 {
    private int gerbilNumber;

    public Gerbil17(int i) {
        gerbilNumber = i;
    }

    public void hop() {
        System.out.println("gerbil " + gerbilNumber + " hops");
    }

}

public class Ex17Gerbil {
    public static void main(String[] args) {
        Map<String, Gerbil17> gerbils = new HashMap<>();
        gerbils.put("Fuzzy", new Gerbil17(0));
        gerbils.put("Spot", new Gerbil17(1));
        gerbils.put("Speedy", new Gerbil17(2));
        gerbils.put("Dopey", new Gerbil17(3));
        gerbils.put("Sleepy", new Gerbil17(4));
        gerbils.put("Happy", new Gerbil17(5));
        Iterator<String> it = gerbils.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + ": ");
            gerbils.get(s).hop();
        }
    }
}
