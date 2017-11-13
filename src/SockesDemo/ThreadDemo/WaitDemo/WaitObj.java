package SockesDemo.ThreadDemo.WaitDemo;

/**
 * Created by Stelawliet on 17/10/4.
 */
public class WaitObj {
    private int number = 0;
    private Object lock;


    public WaitObj(int number, Object lock) {
        this.number = number;
        this.lock = lock;
    }


    public static void main(String[] args) {
        WaitObj waitObj = new WaitObj(0, new Object());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1... start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (waitObj.lock) {
                    System.out.println("t1...synchronized.start");
                    try {

                        System.out.println("wait start");
                        System.out.println(waitObj.number);

                        if (waitObj.number!=2)
                        waitObj.lock.wait();
                        waitObj.number= waitObj.number+1;
                        System.out.println(waitObj.number);
                        System.out.println("wait end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    System.out.println("t1...synchronized.end");

                }
                System.out.println("t1....end");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2... start");
                synchronized (waitObj.lock) {
                    System.out.println("t2...synchronized.start");
                    waitObj.number=waitObj.number+1;

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (waitObj.number==2){

                        System.out.println("t2 notify start");
                        waitObj.lock.notify();
                        System.out.println("t2 notify end");
                    }


                    System.out.println("t3...synchronized.end");
                }
                System.out.println("t2....end");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3... start");
                synchronized (waitObj.lock) {
                    System.out.println("t3...synchronized.start");
                    waitObj.number=waitObj.number+1;

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (waitObj.number==2){

                        System.out.println("t3 notify start");
                        waitObj.lock.notify();
                        System.out.println("t3 notify end");
                    }

                    System.out.println("t2...synchronized.end");

                }
                System.out.println("t3....end");
            }
        }).start();


    }
}

