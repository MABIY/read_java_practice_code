package eleven_chapters;

/**
 * Created by lh on 17-2-6.
 */
public class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void amend() {
        System.out.println("Shape.amend()");
    }

    @Override
    public String toString() {
        return "Shape";
    }
}
