package eleven_chapters;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by lh on 16-12-26.
 */
public class Ex13_Controller {
    // A class from java.util to hold  Event objects
    // not checking  new LinkedList  is use <String>
    private LinkedList<Integer> eventList = new LinkedList(Arrays.asList("1","3"));
//    private LinkedList<Integer> eventList = new LinkedList(Arrays.<Integer>asList("1","3"));

    public void addString(Integer c) {
        eventList.add(c);
    }

    public void run() {
        LinkedList<String> eventListCopy = new LinkedList(eventList);
        ListIterator<String> it = eventListCopy.listIterator();
        while (it.hasNext()) {
            it.next().toString();
            it.previous();
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        Ex13_Controller ex13_controller = new Ex13_Controller();
        System.out.println(ex13_controller.eventList);
    }
}
