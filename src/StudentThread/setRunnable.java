package StudentThread;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class setRunnable implements Runnable{
    private Student s;

    public setRunnable(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i =0;;i++) {
            if (i%2==0){
                s.set("偶数","0");
            }else {
                s.set("奇数","1");
            }

        }
    }
}
