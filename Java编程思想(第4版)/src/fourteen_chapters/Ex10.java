package fourteen_chapters;

import java.util.Objects;

/**
 * Created by lh on 16-11-25.
 */
public class Ex10 {
    public static void main(String[] args) {
        char[] c = new char[10];
        System.out.println("Superclass of char[] c: " +
                c.getClass().getSuperclass());
        System.out.println("char[] c instanceof Object: " + (c instanceof Object));
    }
}
