package StudentThread;

import static StudentThread.Student.count;

/**
 * Created by Stelawliet on 17/9/25.
 */
public class One implements Runnable {
    Student s;
    public One(Student s){
        this.s = s;
    }

    @Override
    public void run() {

        while (count >0) {
            s.one();
        }
    }
}
