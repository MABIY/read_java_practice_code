package eleven_chapters;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lh on 16-12-25.
 */
class Gerbil8 {
    private int gerbilNumber;

    public Gerbil8(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil" + gerbilNumber+ " hops");
    }
}
public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil8> gerbil8s = new ArrayList();
        for (int i = 0; i < 10; i++) {
            gerbil8s.add(new Gerbil8(i));
        }
        Iterator<Gerbil8> it = gerbil8s.iterator();
        while (it.hasNext()) {
            it.next().hop();
        }
    }
}
