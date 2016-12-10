package eleven_chapters;

import java.util.ArrayList;

/**
 * Created by lh on 2016/12/11.
 */
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}
class Orange {}
public class ApplesAndOrangesWithoutGenerics {
//   @SuppressWarnings("unchecked") //压制未经检查的警告
   public static void main(String[] args) {
       //以为ArrayList没有进行类型定义，所以编译的时候会认为你忽略了类型设置，给出编译警告
       ArrayList apples = new ArrayList();
//       ArrayList<Object> apples = new ArrayList<Object>();  //ArrayList 的类型，去除警告
       for (int i =0 ;i <3;i++) {
           apples.add(new Apple());
       }
       // NOT prevented from adding an Orange to apples;
       apples.add(new Orange());
       for (int i = 0; i < apples.size(); i++) {
           ((Apple)apples.get(i)).id();
           // Orange is detected only at run time;
       }
   }
}
