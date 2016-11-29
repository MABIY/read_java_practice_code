package fourteen_chapters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 16-11-29.
 */
class CountedInteger {
    private static long counter; //成员变量不需要初始化自动初始化，如果时static final 必须初始化(可以被Class 对象创建的共享read)
    private final long id = counter++;

    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }
}

