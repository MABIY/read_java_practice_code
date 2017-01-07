package eleven_chapters;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by lh on 17-1-7.
 */
public class Ex20_Vowels {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        Map<Character, Integer> vowelMap = new TreeMap<>();
        for (String s : st) {
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    Integer count = vowelMap.get(v);
                    vowelMap.put(v, count == null ? 1 : count + 1);
                    allVowels++;
                }
            }
        }
        System.out.println("Vowels: " + vowelMap);
        System.out.println("Total vowels : " + allVowels);
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("/home/lh/project/read_java_practice_code/Java编程思想(第4版)/src/eleven_chapters/SetOperations.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}
