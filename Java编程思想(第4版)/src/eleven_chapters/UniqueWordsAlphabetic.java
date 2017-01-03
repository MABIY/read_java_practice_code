package eleven_chapters;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lh on 17-1-3.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("/home/lh/project/read_java_practice_code/Java编程思想(第4版)/src/eleven_chapters/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
