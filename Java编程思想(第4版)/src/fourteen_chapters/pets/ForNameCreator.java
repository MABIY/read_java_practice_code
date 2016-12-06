package fourteen_chapters.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 16-12-6.
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    //Types that you want to randomly created;
    private static String[] typeNames = {
            "fourteen_chapters.pets.Mutt",
            "fourteen_chapters.pets.Pug",
            "fourteen_chapters.pets.EgyptianMau",
            "fourteen_chapters.pets.Manx",
            "fourteen_chapters.pets.Cymric",
            "fourteen_chapters.pets.Rat",
            "fourteen_chapters.pets.Mouse",
            "fourteen_chapters.pets.Hamster",
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name)); // 如果不加@SuppressWarnings("unchecked")会报ForNameCreator.java uses unchecked or unsafe operations.
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
