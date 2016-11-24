package rules_5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by lh on 16-10-31.
 */
public class Person {
    private final Date bithDate;
    //other fileds ,methods,and constructor object
    //Don't DO THIS !

    Person(Date birthday) {
        bithDate = birthday;
    }
    public boolean isBabyBoomer() {
        //unnecessary allocation of expensive object
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return bithDate.compareTo(boomStart)>= 0 && bithDate.compareTo(boomEnd)< 0;
    }
}

class Person1 {
    private final Date birthDate;

    //Other fields,methods,and constructor omitted
    Person1(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * the starting end ending dates of the baby boom.
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }
    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >=0 && birthDate.compareTo(BOOM_END)<0;
    }

}




















































