package eleven_chapters;

import fourteen_chapters.pets.Pet;
import fourteen_chapters.pets.Pets;

import java.util.*;

/**
 * Created by lh on 17-2-7.
 */
class PetSequence32 {
    protected Pet[] pets = Pets.createArray(8);
}
public class Ex32 extends PetSequence32 implements Iterable<Pet>{
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public  Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List list = new LinkedList(Arrays.asList(pets));
                Collections.shuffle(list);
                return list.iterator();
            }
        };
    }

    public static void main(String[] args) {
        Ex32 ex32 = new Ex32();
        System.out.println("pets: ");
        for (Pet p : ex32) {
            System.out.println(p + " ");
        }
        System.out.println();
        for (Pet p : ex32.reversed()) {
            System.out.println(p + " ");
        }
        System.out.println();
        for (Pet p : ex32.randomized()) {
            System.out.println(p + " ");
        }
    }
}
