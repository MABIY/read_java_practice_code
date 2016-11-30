package fourteen_chapters;

/**
 * Created by lh on 16-11-30.
 */
class Building {}
class House extends Building {}
public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);  //通过Class<House> 转换 b to Houst
        h = (House) b;  // .... or just do this
    }
}
