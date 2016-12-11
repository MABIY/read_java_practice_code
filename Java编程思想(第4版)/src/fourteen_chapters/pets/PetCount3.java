package fourteen_chapters.pets;

import net.mindview.util.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lh on 16-12-9.
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            // Class.isInstance() eliminates instanceofs
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
//                if(pair)
            }
        }
    }
}
