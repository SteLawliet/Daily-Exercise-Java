package StudentThread;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class getRunnable implements Runnable {
    private Student s;

    public getRunnable(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (;; ) {
            s.get();
        }
    }
}
