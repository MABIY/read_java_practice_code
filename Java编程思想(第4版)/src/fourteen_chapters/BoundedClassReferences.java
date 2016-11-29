package fourteen_chapters;

/**
 * Created by lh on 16-11-29.
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        //Or anything else derived form Number
        bounded = short.class;
    }
}
