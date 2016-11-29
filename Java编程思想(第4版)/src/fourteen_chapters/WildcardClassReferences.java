package fourteen_chapters;

/**
 * Created by lh on 16-11-29.
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
