package eleven_chapters;

import fourteen_chapters.pets.Pet;
import fourteen_chapters.pets.Pets;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by lh on 17-2-6.
 */
public class Ex30 implements Collection<Pet>{

    private Pet[] pets = Pets.createArray(8);
    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

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
                return pets[index++];
            }

        };
    }

    @Override
    public Object[] toArray() {
        return pets;
    }

    @Override
    public <T> T[] toArray(T[] a)  {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean add(Pet pet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        if (size() != 0) {
            for (Pet p : pets) {
                p = null;
            }
        }
    }

    public static void main(String[] args) {
        Ex30 c = new Ex30();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }

}
