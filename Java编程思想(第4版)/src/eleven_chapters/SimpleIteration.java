package eleven_chapters;

import fourteen_chapters.pets.Pet;
import fourteen_chapters.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lh on 16-12-25.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" +p+ " ");
        }
        System.out.println();
        // A simple approach , when possible:
        for (Pet p : pets) {
            System.out.print(p.id() + ":" +p+ " ");
        }
        System.out.println();
        // An Iterator can also remove elements:
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.print(pets);
    }
}
