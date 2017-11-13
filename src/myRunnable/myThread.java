package myRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class myThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyRunnable myRunnable = new MyRunnable();
//        Thread t1 = new Thread(myRunnable,"1");
//        Thread t2 = new Thread(myRunnable,"2");
//        Thread t3 = new Thread(myRunnable,"3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        System.out.println("count"+myRunnable.getI());


        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future0 = executorService.submit(new CallAble(50) );
        Future<Integer> future1 = executorService.submit(new CallAble(10));

        int i0 = future0.get();
        int i1 = future1.get();
        System.out.println("----------");
        System.out.println(i0);
        System.out.println(i1);
        System.out.println("----------");
    }
}
