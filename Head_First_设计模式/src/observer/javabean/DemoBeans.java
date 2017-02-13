package observer.javabean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by lh on 17-2-13.
 *  JavaBean abserver example
 */
public class DemoBeans {
    private String demoName;
    private final PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    public DemoBeans() {
        demoName = "initValue";
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        String oldValue = this.demoName;
        this.demoName = demoName;
        listeners.firePropertyChange("demoName", oldValue, demoName);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }

}

class JavaBeanAbserverTest {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        DemoBeans beans = new DemoBeans();
        beans.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Oldvalue:"+ evt.getOldValue());
                System.out.println("NewValue:" + evt.getNewValue());
                System.out.println("tPropertyName:" +evt.getPropertyName());
            }
        });
        beans.setDemoName("test");
    }

}
