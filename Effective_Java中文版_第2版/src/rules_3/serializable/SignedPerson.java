package rules_3.serializable;

import java.io.Serializable;

/**
 *  用于被密钥包装的类
 * Created by lh on 17-2-20.
 */
public class SignedPerson implements Serializable {
    private static final long serialVersionUID = 8533862948800025300L;
    private String name;
    private int age;
    private boolean isNB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isNB() {
        return isNB;
    }

    public void setNB(boolean isNB) {
        this.isNB = isNB;
    }
}
