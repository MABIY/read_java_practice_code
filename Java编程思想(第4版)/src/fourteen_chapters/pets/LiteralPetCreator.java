package fourteen_chapters.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lh on 16-12-8.
 */
public class LiteralPetCreator extends PetCreator {

    // NO try block needed
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class,
                    EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class
            ));
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        types.add(Pet.class);
        System.out.println(types);
    }
}
