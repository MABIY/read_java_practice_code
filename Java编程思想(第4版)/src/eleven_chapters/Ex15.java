package eleven_chapters;

import net.mindview.util.Stack;
/**
 * Created by lh on 16-12-27.
 */
public class Ex15 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
         char[] queueInfo ="+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---".toCharArray();
        for (int i = 0; i < queueInfo.length; i++) {
            if (queueInfo[i] =='+') {
                stringStack.push(queueInfo[++i]+"");
            } else if(queueInfo[i]=='-'){
                if (!stringStack.empty()) {
                    stringStack.peek();
                }
            }
        }
        System.out.println(stringStack.toString());
    }
}
