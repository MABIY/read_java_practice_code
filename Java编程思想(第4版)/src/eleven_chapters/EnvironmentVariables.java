package eleven_chapters;

import java.util.Map;

/**
 * Created by lh on 17-2-6.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}// Excute to see output
