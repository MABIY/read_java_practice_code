package serializable;

import java.io.*;

/**
 * 序列化 ID 问题
 情境：两个客户端 A 和 B 试图通过网络传递对象数据，A 端将对象 C 序列化为二进制数据再传给 B，B 反序列化得到 C。
 问题：C 对象的全类路径假设为 com.inout.Test，在 A 和 B 端都有这么一个类文件，功能代码完全一致。也都实现了 Serializable 接口，但是反序列化时总是提示不成功。
 解决：虚拟机是否允许反序列化，不仅取决于类路径和功能代码是否一致，一个非常重要的一点是两个类的序列化 ID 是否一致（就是 private static final long serialVersionUID = 1L）
 B locale Practice project --> serializable
 * Created by lh on 17-2-19.
 */
public class A implements Serializable{
    private static final long serialVersionUID =2L;
    private  String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("A");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        A a = (A) ois.readObject();

    }
}
