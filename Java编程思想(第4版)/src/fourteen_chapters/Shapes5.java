package fourteen_chapters;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lh on 16-11-25.
 */
public class Shapes5 {
    public static void rotate(Shape s) {
        if (!(s instanceof Circle)) {
            System.out.println(s.toString()+ "rotate");
        }
    }

    public static void main(String[] args) {
        //upcasting to Shape;
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        //downcasting back to specific shape;
        for (Shape shape : shapeList) {
            shape.draw();
        }
        System.out.println();
        for (Shape shape : shapeList) {
            rotate(shape);
        }
    }

}
