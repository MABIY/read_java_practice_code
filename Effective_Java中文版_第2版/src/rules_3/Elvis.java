package rules_3;

import java.io.*;

/**
 * Created by lh on 17-2-19.
 * 在序列化过程中，虚拟机会试图调用对象类里的 writeObject 和 readObject 方法，进行用户自定义的序列化和反序列化，如果没有这样的方法，则默认调用是 ObjectOutputStream 的 defaultWriteObject 方法以及 ObjectInputStream 的 defaultReadObject 方法。用户自定义的 writeObject 和 readObject 方法可以允许用户控制序列化的过程，比如可以在序列化的过程中动态改变序列化的数值。基于这个原理，可以在实际应用中得到使用，用于敏感字段的加密工作，清单 3 展示了这个过程。
 */
// Singleton with public final field
public class Elvis implements Serializable{
    public static transient final Elvis INSTANCE = new Elvis();

    public int a = 0;
    private Elvis() {
        a =2;
        System.out.println("Elvis Test");
    }

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding");
    }

    /**
     * Write replace object. WriteReplace and readResove 替换写读 序列化
     *
     * @return the object
     */
//    private Object WriteReplace() {
//        return null;
//    }

    // 通过反序列化类的方式调用 readResolve
//    private Object readResolve() {
//        return INSTANCE;
//    }
}

class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(Elvis.INSTANCE);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 通过反序列化类的方式调用 readResolve
        Elvis newInstance = (Elvis) ois.readObject();
        //是否有调用constructor
        System.out.println("newInstance.a:"+newInstance.a);
        System.out.println("ElvisINSTANCE.a:"+Elvis.INSTANCE.a);
        // 判断是否是同一个对象
        System.out.println(newInstance == Elvis.INSTANCE);
    }
}
