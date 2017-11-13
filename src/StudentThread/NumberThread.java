package StudentThread;

/**
 * Created by Stelawliet on 17/9/25.
 */
public class NumberThread {
    public static void main(String[] args) {
        Student s = new Student();
        One one =new One(s);
        Two two =new Two(s);
        Three three = new Three(s);

        Thread oneThread = new Thread(one,"oneThread");
        Thread twoThread = new Thread(two,"twoThread");
        Thread threeThread = new Thread(three,"threeThread");

        oneThread.start();
        twoThread.start();
        threeThread.start();
    }
}
