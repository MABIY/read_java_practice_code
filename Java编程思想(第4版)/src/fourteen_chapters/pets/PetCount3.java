package fourteen_chapters.pets;

import java.util.LinkedHashMap;

/**
 * Created by lh on 16-12-9.
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map);
        }
    }
}
