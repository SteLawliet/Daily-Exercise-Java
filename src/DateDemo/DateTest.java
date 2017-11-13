package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Created by Stelawliet on 17/9/10.
 */
public class DateTest {
    public static void main(String[] s){

        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2017);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DATE,10);
        System.out.println(c);
        c.setTimeInMillis(System.currentTimeMillis());
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(2)+1;
        int mDay = c.get(5);

        System.out.println(""+mYear+"年"+mMonth+"月"+mDay+"日");


}
}
