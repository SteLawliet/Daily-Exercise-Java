package reflace;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class c =Class.forName("reflace.Teacher");
        Constructor constructor = c.getDeclaredConstructor(String.class,String.class,int.class);
        Object object = constructor.newInstance("sss","csac",1223);
        Method[] methods =c.getDeclaredMethods();
        for (Method s:methods
             ) {
            System.out.println(s);

        }
        System.out.println("---------------------------");
        Method method0 = c.getMethod("setName", String.class);
        Object object0 = method0.invoke(object,"123");

        System.out.println(object);
        System.out.println("----------------------------");

        constructor = c.getDeclaredConstructor();
        Object object1 = constructor.newInstance();
        Method method2 = c.getDeclaredMethod("setName", String.class);
        method2.invoke(object1,"name1");
        System.out.println(object1);
        System.out.println("-----------------------------");

        Field[] fields = c.getDeclaredFields();
        for (Field  field:fields
             ) {
            System.out.println(field);
        }

        Field field0 =c.getDeclaredField("name");
        field0.setAccessible(true);
        System.out.println(field0.get(object1));
        System.out.println("--------------------------------");

        System.out.println(c.getInterfaces().toString());

    }
}
