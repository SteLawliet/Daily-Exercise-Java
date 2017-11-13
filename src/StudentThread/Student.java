package StudentThread;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class Student {
    private String name;
    private String password;
    private boolean isSeted = false;
    private int number = 0;
    static int count=30;


    public synchronized void set(String name, String password) {
        if (this.isSeted) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.password = password;
        isSeted = true;
        this.notify();
    }

    public synchronized void get() {
        if (!this.isSeted) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":"+this.name + "---" + this.password);
        this.isSeted = false;
        this.notify();
    }
    public synchronized void one(){

//        if (number ==2 || number ==3) {
//
//        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        if (number == 1|| number==0){
            number =1;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-----"+count--);
            this.number=2;
        }else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.notify();
    }
    public synchronized void two(){

//        if (number ==0 ||number ==1 || number ==3 ) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.number=2;
//        System.out.println(Thread.currentThread().getName()+"-----"+this.number);
//        this.number = 3;
//        this.notify();
//        if (number ==2 || number ==3) {
//
//        }


        if (number == 2){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-----"+count--);
            this.number=3;
        }else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.notify();
    }
    public synchronized void three(){


//        if (number ==0 ||number ==1 || number ==2) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        if (number == 3){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---"+count--);
            this.number=1;
        }else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
    }


}
