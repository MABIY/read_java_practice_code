package fourteen_chapters;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lh on 16-11-25.
 */
abstract class Shape6 {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle6 extends Shape6 {
    boolean flag = false;

    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted" + "Square";
    }
}

class Square6 extends Shape6 {
    boolean flag = false;
    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted" + "Square";
    }
}

class Triangle6 extends Shape6 {
    boolean flag = false;
    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
    }
}
public class Shapes6 {
    public static void setFlag(Shape6 s) {
        if (s instanceof Triangle6) {
            ((Triangle6) s).flag = true;
        }
    }

    public static void main(String[] args) {
        //upcasting to Shape
        List<Shape6> shapeList = Arrays.asList(
                new Circle6(), new Square6(), new Triangle6()
        );
        for (Shape6 shape6 : shapeList) {
            setFlag(shape6);
            System.out.println(shape6);
        }
    }
}
