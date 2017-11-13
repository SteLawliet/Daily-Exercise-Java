package myRunnable;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class MyRunnable implements Runnable {

    private int anInt = 50;

    private int i=0;
    @Override
    public void run() {
        while (true) {
            if(anInt >0){
                System.out.println
                        (Thread.currentThread().getName()+"-----"+"---"+anInt--);
                i++;
            }else {
                System.exit(0);
            }
        }
    }
    public int getI() {
        return i;
    }

}
