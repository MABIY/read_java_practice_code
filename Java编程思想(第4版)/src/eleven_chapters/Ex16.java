package eleven_chapters;

import net.mindview.util.TextFile;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lh on 17-1-3.
 */
public class Ex16 {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        for (String s : st) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    count++;
                    allVowels++;
                }
            }
            System.out.println(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.println("Total vowels: " + allVowels);
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("/home/lh/project/read_java_practice_code/Java编程思想(第4版)/src/eleven_chapters/SetOperations.java", "\\W+")
        );
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}
