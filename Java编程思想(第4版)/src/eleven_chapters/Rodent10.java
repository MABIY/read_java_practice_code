package eleven_chapters;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by lh on 16-12-25.
 */
class RandomRodentGernerator {
    private Random rand = new Random();
    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Rat();
            case 2:
                return new Squirrel();
        }
    }
}

class Rodent {
    private String name = "Rodent";
    protected void eat() {
        System.out.println("Rodent.eat()");
    }
    protected void run() {
        System.out.println("Rodent.run()");
    }
    protected void sleep() {
        System.out.println("Rodent.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    protected void eat() {
        System.out.println("Mouse.eat()");
    }
    protected void run() {
        System.out.println("Mouse.run()");
    }
    protected void sleep() {
        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";
    protected void eat() {
        System.out.println("Rat.eat()");
    }
    protected void run() {
        System.out.println("Rat.run()");
    }
    protected void sleep() {
        System.out.println("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    protected void eat() {
        System.out.println("Squirrel.eat()");
    }
    protected void run() {
        System.out.println("Squirrel.run()");
    }
    protected void  sleep() {
        System.out.println("squirrel.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Rodent10 {
    private static RandomRodentGernerator gen = new RandomRodentGernerator();

    public static void main(String[] args) {
        List<Rodent> rodentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rodentList.add(gen.next());
        }
        Iterator<Rodent> it = rodentList.iterator();
        while (it.hasNext()) {
            Rodent r = it.next();
            System.out.println(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
