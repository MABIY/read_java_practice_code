package java_extend;

/**
 * Created by lh on 17-2-21.
 */
public class GetClassPath {
    public static void main(String[] args) {
        String[] properties =System.getProperty("java.class.path").split(":");
        for (String property : properties) {
            System.out.println(property);
        }

    }
}
