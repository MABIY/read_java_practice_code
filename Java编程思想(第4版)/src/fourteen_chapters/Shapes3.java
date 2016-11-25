package fourteen_chapters;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lh on 16-11-25.
 */
class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes3 {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        // downcasting back to specific shape
        for (Shape shape : shapeList) {
            shape.draw();
        }
        Rhomboid r = new Rhomboid();
        ((Shape)r).draw();
        // invonvertiable typs
        Shape s = (Shape) r;
        if (s instanceof Circle) {
            ((Circle)s).draw();
        } else if (!(s instanceof Circle)) {
            System.out.println("(Shape)r is not");
        }
//        ((Circle)r).draw();
    }




}
