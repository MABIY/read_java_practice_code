package fourteen_chapters;

/**
 * Created by lh on 16-11-29.
 */
public class GenericClassReferences {

    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;      //应该做了类型Class的自动转换
        genericIntClass = Integer.class; // Same thing
        intClass = Double.TYPE;
//     genericIntClass = Double.TYPE;  //Illegal\
//     Class<Number> genericNumberClass = int.class;  //need Number.class then is Integer.class
        Class<? extends Number> genericNumberClass = int.class; // this is ok extend Number
    }
}

