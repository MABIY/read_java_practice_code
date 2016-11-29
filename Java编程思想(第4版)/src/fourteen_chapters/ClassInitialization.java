package fourteen_chapters;

import java.util.Random;

/**
 * Created by lh on 16-11-29.
 */
class Initable {
    static final char staticFinal = 1;
    static final int staticFinal2 = ClassInitialization.random.nextInt(10000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}
class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random random = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable red");
        //Does not trigger initialization;
        System.out.println(Initable.staticFinal);
        // Does trigger initialization;
        System.out.println(Initable.staticFinal2);
        //Does trigger initialization;
        Class initable3 = Class.forName("fourteen_chapters.Initable3");
        System.out.println("After creating Initable ref");
        System.out.println(Initable3.staticNonFinal);
        System.out.println(int.class);
    }
}
