package eleven_chapters;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by lh on 17-1-7.
 */
public class Ex21_UniqueWords {
    public static void main(String[] args) {
      List<String> words = new ArrayList<>(new TextFile("/home/lh/project/read_java_practice_code/Java编程思想(第4版)/src/eleven_chapters/SetOperations.java", "\\W+"));
        System.out.println("Words to count: " + words);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        Iterator it = words.iterator();
        int totalWords = 0;
        while (it.hasNext()) {
            String s = (String) it.next();
//            if (words.contains(s)) {
                Integer count = wordCount.get(s);
                wordCount.put(s, count == null ? 1 : count + 1);
                totalWords++;
//            }
        }
        System.out.println();
        System.out.println("Word count: " + wordCount);
        System.out.println();
        System.out.println("Total world: " + totalWords);
    }
}
