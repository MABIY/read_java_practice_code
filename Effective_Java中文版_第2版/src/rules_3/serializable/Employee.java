package rules_3.serializable;

import java.io.Serializable;

/**
 *  另外一种加密方式
 * Created by lh on 17-2-20.O
 */
public class Employee implements Serializable{
    private static final long serialVersionUID = -7331553489509930824L;
    private String _name;
    private double _salary;
    public Employee(String name,double salary) {
        this._name = name;
        this._salary = salary;
    }

   /*
    * 通过实现writeReplace方法来自动返回一个替代的SealedObject对象不可行，会导致栈溢出。因为SealedObject会对传入的待加密对象进行深Copy。这个操作就是通过序列化完成的。所以，会递归成死循环。
    */
    /*
        private Object writeReplace()throws java.io.ObjectStreamException
    {

        SealedObject so = null;
        try {
            so =  new SealedObject(this, new NullCipher());
        } catch (IllegalBlockSizeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return so;


    }
    */

    public String toString(){
        return "Employee Name: " + this._name + " with salary " + this._salary;
    }
}
