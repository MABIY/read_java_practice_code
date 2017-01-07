    package eleven_chapters;

    import fourteen_chapters.pets.Cat;
    import fourteen_chapters.pets.Dog;
    import fourteen_chapters.pets.Hamster;
    import fourteen_chapters.pets.Pet;

    import java.util.HashMap;
    import java.util.Map;

    /**
     * Created by lh on 17-1-7.
     */
    public class PetMap {
        public static void main(String[] args) {
            Map<String, Pet> petMap = new HashMap<>();
            petMap.put("My Cat", new Cat("Molly"));
            petMap.put("My Dog", new Dog("Ginger"));
            petMap.put("My Hamster", new Hamster("Bosco"));
            System.out.println(petMap);
            Pet dog = petMap.get("My Dog");
            System.out.println(dog);
            System.out.println(petMap.containsKey("My Dog"));
            System.out.println(petMap.containsValue(dog));
        }
    }
