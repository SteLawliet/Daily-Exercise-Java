package StudentThread;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class MainTest {
    public static void main(String[] args) {
        Student s = new Student();
        getRunnable get = new getRunnable(s);
        setRunnable set = new setRunnable(s);

        Thread setThread = new Thread(set, "setThread");
        Thread getThread = new Thread(get, "getThread");

        setThread.start();
        getThread.start();

    }
}
