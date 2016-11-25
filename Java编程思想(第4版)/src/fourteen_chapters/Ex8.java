package fourteen_chapters;

/**
 * Created by lh on 16-11-25.
 */
class A {}
class B extends A{}
class C extends B {}
public class Ex8 {
    public static void Hierarchy(Object o) {
        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is a subclass of" +
            o.getClass().getSuperclass());
            try {
                Hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access");
            } catch (InstantiationException e) {
                System.out.println("Unable to instantlate obj");
            }
        }
    }

    public static void main(String[] args) {
        Hierarchy(new C());
    }
}
