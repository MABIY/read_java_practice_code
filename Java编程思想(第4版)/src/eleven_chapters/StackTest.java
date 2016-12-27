package eleven_chapters;

import java.util.*;

//import net.mindview.util.Stack;

/**
 * Created by lh on 16-12-27.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "My dog has fileas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        java.util.Stack<String> stack1 = new java.util.Stack<>();
        for (String s : "My dog has fileas".split(" ")) {
            stack1.push(s);
        }
        while (!stack1.empty()) {
            System.out.print(stack1.pop() + " ");
        }
    }
}
