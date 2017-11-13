package reflace;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class StudentReflect {
    public static void main(String[] args)
            throws
            ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException

    {

        Class studentClass = Class.forName("reflace.Student");
        Constructor constructor = studentClass.getDeclaredConstructor(String.class,String.class,int.class);

        Object object0 = constructor.newInstance("zzq","335",123334);

        Method method = studentClass.getMethod("show");

        Method method1 = studentClass.getMethod("setName",String.class);

        Method method2 = studentClass.getDeclaredMethod("setsId", int.class);

        System.out.println("method0:");
        method.invoke(object0);

        System.out.println("method1:");
        method1.invoke(object0,"yxq");

        System.out.println("method2:");
        method2.invoke(object0,152);

        method.invoke(object0);

    }
}
