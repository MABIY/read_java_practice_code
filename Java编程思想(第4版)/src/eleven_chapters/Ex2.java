package eleven_chapters;

import java.util.*;

/**
 * Created by lh on 16-12-12.
 */
public class Ex2 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>() {};
        for (int i = 0; i < 10; i++) {
            c.add(i);
            //添加 成功返回true 失败返回false
            c.add(1);
        }
        for (Integer i : c) {
            System.out.println(i + " , ");
        }

    }
}
