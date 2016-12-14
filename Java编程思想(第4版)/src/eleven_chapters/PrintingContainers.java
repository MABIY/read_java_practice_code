package eleven_chapters;

import java.util.*;

/**
 * Created by lh on 16-12-14.
 */
public class PrintingContainers {
    static Collection file(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map file(Map<String, String> map) {
        map.put("rat", "Fluzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(file(new ArrayList<String>()));
        System.out.println(file(new LinkedList<String>()));
        System.out.println(file(new HashSet<String>()));
        System.out.println(file(new TreeSet<String>()));
        System.out.println(file(new LinkedHashSet<String>()));
        System.out.println(file(new HashMap<String,String>()));
        System.out.println(file(new TreeMap<String,String>()));
        System.out.println(file(new LinkedHashMap<String, String>()));

    }
}
