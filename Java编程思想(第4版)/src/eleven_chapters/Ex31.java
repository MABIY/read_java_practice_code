package eleven_chapters;

import fourteen_chapters.Shapes;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by lh on 17-2-6.
 */
public class Ex31 implements Iterable<Shape>{
    private Random rand = new Random();

    public Shape make() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    private Shape[] shapes;

    public Ex31(int n) {
        shapes = new Shape[n];
        for (int i = 0; i < n; i++) {
            shapes[i] = make();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }
        };
    }

    public static void main(String[] args) {
        Ex31 ex31 = new Ex31(20);
        for (Shape s : ex31) {
            System.out.println(s);
        }
    }
}

