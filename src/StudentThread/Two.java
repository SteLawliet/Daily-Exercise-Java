package StudentThread;

import static StudentThread.Student.count;

/**
 * Created by Stelawliet on 17/9/25.
 */
public class Two implements Runnable {

    Student s;
    public Two(Student s){
        this.s = s;
    }

    @Override
    public void run() {
        while (count >0) {
            s.two();
        }
    }
}
