package command.remoteWL;

/**
 * Created by lh on 17-3-2.
 */
public class Hottub {
    boolean on;
    int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("Hottub is not bubbling");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("Hottub jets are on");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("Hottub jets are off");
        }
    }

    public void heat() {
        temperature = 105;
        System.out.println("Hottub is heating to a steming 105 degrees");
    }

    public void cool() {
        temperature = 98;
        System.out.println("Hottub is cooling to 98 degrees");
    }
}
