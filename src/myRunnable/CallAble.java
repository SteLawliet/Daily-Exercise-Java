package myRunnable;

import java.util.concurrent.Callable;

/**
 * Created by Stelawliet on 17/10/16.
 */
public class CallAble implements Callable<Integer> {
    int num;
    int sum =0;
    public CallAble (int num){
        this.num=num;
    }
    @Override
    public Integer call() throws Exception {
        for (int i = 1; i <=num ; i++) {

            sum+=i;

        }
        Thread.sleep(1000);
        return sum;
    }
}
