package reflace;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class Handler implements InvocationHandler {

//    private Object object;
//    public Handler(Object object){
//        this.object = object;
//    }
    private Object object;

    public Handler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("start");
        long start = System.currentTimeMillis();
        System.out.println(start);
        Object flag = method.invoke(object,args);
        long end = System.currentTimeMillis();
        System.out.println(end);
        long s = (long)(end -start);
        System.out.println(s+"ms");
        return flag;
    }
}
