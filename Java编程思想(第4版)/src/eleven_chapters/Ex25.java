package eleven_chapters;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by lh on 17-1-10.
 */
public class Ex25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> m = new LinkedHashMap<>();
        List<String> words = new LinkedList<>();
        words.addAll(new TextFile("/home/lh/project/read_java_practice_code/Java编程思想(第4版)/src/eleven_chapters/SetOperations.java", "\\w"));
        System.out.println("Words in file:" + words);
        Iterator<String> itWords = words.iterator();
        int count = 0;
        while (itWords.hasNext()) {
            String s = itWords.next();
            count++;
            if (!m.keySet().contains(s)) {
                ArrayList<Integer> ai = new ArrayList<>();
                ai.add(0, count);
                m.put(s, ai);
            } else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println("Map of word locations: " + m);
    }
}
