package eleven_chapters;

import fourteen_chapters.pets.Pet;
import fourteen_chapters.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by lh on 17-2-4.
 */
public class CollectionSequence extends AbstractCollection<Pet>{
    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++]; // beautiful code
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();

    }
}
