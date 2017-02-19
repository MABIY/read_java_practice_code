package serializable;

import java.io.*;

/**
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

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("A"));
        oos.writeObject(new A());
        oos.close();
    }
}
