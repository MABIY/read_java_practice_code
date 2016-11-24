package fourteen_chapters;

import java.util.ArrayList;

/**
 * Created by lh on 16-11-23.
 */
public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }

    }
}
