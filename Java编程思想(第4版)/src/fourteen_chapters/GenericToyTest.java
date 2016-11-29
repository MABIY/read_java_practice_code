package fourteen_chapters;

/**
 * Created by lh on 16-11-29.
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass = FancyToy.class;
        //Produces exact type: 得到具体类型
        FancyToy fancyToy = ftClass.newInstance();
        //Produces Object type;
        Class<?> ftClass1 = FancyToy.class;
        FancyToy fancyToy1 = (FancyToy) ftClass1.newInstance();

        //this won't compile because ftClass be defined Class<FancyToy> so Class<Toy> is error ,although Toy is supperclass of  FancyToy ,base on Class<FancyToy> .getSupperClass()  it shoud be defined Class<? super FancyToy>
        // Class<Toy> up2 = ftClass.getSuperclass();
        Class<? super FancyToy> up2 = ftClass.getSuperclass();
        // Only produces Object beacuse <? super FancyToy>
        up2.newInstance();
        Toy toy = (Toy)up2.newInstance();
    }

}
