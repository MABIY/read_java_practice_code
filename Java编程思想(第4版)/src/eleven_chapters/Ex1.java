package eleven_chapters;

import java.util.ArrayList;

/**
 * Created by lh on 16-12-11.
 */
class Gerbil {
    private int gerbilNumber;

    public Gerbil(int i) {
        gerbilNumber = i;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hop");
    }

}
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
        //or ,alternatively, using foreach syntax;
        for (Gerbil g : gerbils) {
            g.hop();
        }
    }
}
