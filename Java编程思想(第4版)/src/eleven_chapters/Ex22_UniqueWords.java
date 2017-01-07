package eleven_chapters;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by lh on 17-1-7.
 */
class Word22 {
    static int totalWords = 0;
    String s;
    int count;

    public Word22(String s, int count) {
        this.s = s;
        this.count = count;
        totalWords++;
    }
    public String toString() {
        return s + ": " + count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word22) {
            return s.equals(((Word22) obj).s);
        } else {
            return false;
        }
    }
     //  hashSet add 通过hashSet 完全相同后且equals相同才判断相同
    @Override
    public int hashCode() {
        return s.hashCode();
    }
}
public class Ex22_UniqueWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("/home/lh/project/read_java_practice_code/Java编程思想(第4版)/src/eleven_chapters/SetOperations.java", "\\W+"));
        Collections.sort(words);
        System.out.println("Words to count , sorted: " + words + "\n words size:"+ words.size());
        Set<Word22> wordObjects = new HashSet<Word22>();
        Iterator it = words.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (s.equals(words.get(i))) {
                    count++;
                }
            }
            Word22 w = new Word22(s,count);
            wordObjects.add(w);
        }
        System.out.println("Word count:" + wordObjects);
        System.out.println("Total words " + Word22.totalWords);
    }
}
