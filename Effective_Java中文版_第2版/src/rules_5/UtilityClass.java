package rules_5;

/**
 * Created by lh on 16-10-31.
 */
// Noninstantiable utility class
public class UtilityClass {
        //Suppress default constructor
    private UtilityClass() {
        String s = new String("stringette");
        throw new AssertionError();
    }

    public static void main(String[] args) {
        String s0= "kvill";
        String s1=new String("kvill");
        String s2=new String("kvill");
        System.out.println( s0==s1 );
        System.out.println( "**********" );
        s1.intern();
        s2=s2.intern(); //把常量池中"kvill"的引用赋给s2
        System.out.println( s0==s1);
        System.out.println( s0==s1.intern() );
        System.out.println( s0==s2 );
        Boolean.valueOf("true");


    }

}
