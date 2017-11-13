package reflace;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class ProxyTest{
    public static void main(String[] args) {

        List arrayList = new ArrayList();

        Handler handler =new Handler(arrayList);

        List list =(List)Proxy.newProxyInstance
                (arrayList.getClass().getClassLoader(),arrayList.getClass().getInterfaces(),handler);


       // boolean b = (Boolean)
                list.add("scfedfscsv");

        String s = (String) list.get(0);
        System.out.println(s);
       // System.out.println(b);


    }
}
