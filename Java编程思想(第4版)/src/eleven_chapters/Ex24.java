package eleven_chapters;

import java.util.*;

/**
 * Created by lh on 17-1-10.
 */
public class Ex24 {
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("ten", 10);
        m.put("nine", 9);
        m.put("eight",8);
        m.put("seven", 7);
        m.put("six", 6);
        m.put("five", 5);
        m.put("four", 4);
        m.put("three", 3);
        m.put("two", 2);
        m.put("one", 1);
        m.put("zero", 0);
        System.out.println("Map to sort: " + m);
        // temporary map to hold  entrys
        Map<String, Integer> mTemp = new LinkedHashMap<>();
        //user TreeSet to sort the keySet() , so not effect of map
        Set<String> ss = new TreeSet<>(m.keySet());
//        Set<String> ss = m.keySet();  // getMap view  if m.remove(s)  in Iterator get a error concurrentModificationException
        // mover sorted keys to temp map:

//        Iterator<String> itss = ss.iterator();
//        while (itss.hasNext()) {
//            String s = itss.next();
//            Integer i = m.get(s);
//            m.remove(s);
//            mTemp.put(s, i);
//        }
        //replace iterator  foreach
        for (String s : ss) {
            mTemp.put(s, m.get(s));
            m.remove(s);
        }

        // get sorted list of temp keys:   not need use TreeSet
        Set<String> ssTemp = new TreeSet<String>(mTemp.keySet());
        // move sorted entrys back to map:
        Iterator<String> itssTemp = ssTemp.iterator();
        while (itssTemp.hasNext()) {
            String s = (String) itssTemp.next();
            Integer i = mTemp.get(s);
            mTemp.remove(s);
            m.put(s, i);
        }
        // done with temp;
        mTemp.clear();
        System.out.println("Sorted map: " + m);
    }
}
