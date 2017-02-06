package eleven_chapters;

/**
 * Created by lh on 17-2-6.
 */
public class Square extends Shape {
    @Override public void draw() { System.out.println("Square.draw()"); }
    @Override public void erase() { System.out.println("Square.erase()"); }
    @Override public void amend() { System.out.println("Square.amend()"); }
    @Override public String toString() { return "Square"; }
}