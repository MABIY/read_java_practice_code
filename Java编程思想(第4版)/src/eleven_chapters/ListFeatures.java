package eleven_chapters;

import fourteen_chapters.pets.*;
import java.util.*;

/**
 * Created by lh on 16-12-14.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h); // Automatically resizes
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h); // Remove by object
        Pet p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("S: " + pets.indexOf(cymric));
        System.out.println("G: " + pets.remove(cymric));
        // Must be the exact Object
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new fourteen_chapters.pets.Mouse()); // insert at an index
        System.out.println("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub); // in-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll();
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, random); // Mix it up
        System.out.println("Shuffled sublist: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub); //  only removes exact objects
        System.out.println("13: " + copy);
        copy = new ArrayList<Pet>(pets); // Get a frosh copy
        copy.remove(2); //remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new fourteen_chapters.pets.Mouse()); // Replace an elements
        System.out.println("16: " + copy);

        copy.addAll(2, copy); // Insert a list in the middle

        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear(); // Remove all elements
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        //pets.remove(2);
        // pets.remove(2);
        //Pet[] pa = pets.toArray(new Cat[0]);   // 控制runtime Type

        Pet[] pa = pets.toArray(new Pet[0]);

        Object[] pa1 = pets.toArray(new Object[0]); // equal pets.toArray()

        System.out.println("23: " + pa[3].id());
    }
}
