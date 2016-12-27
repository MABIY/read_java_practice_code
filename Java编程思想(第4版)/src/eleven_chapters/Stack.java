package eleven_chapters;

import java.util.LinkedList;

/**
 * Created by lh on 16-12-27.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
