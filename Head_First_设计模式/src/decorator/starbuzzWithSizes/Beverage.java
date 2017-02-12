package decorator.starbuzzWithSizes;

/**
 * Created by lh on 17-2-12.
 */
public  abstract class Beverage {
    public enum Size {TALL,GRANDE, VENTI}

    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double  cost();
}
