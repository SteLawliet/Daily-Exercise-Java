package StudentThread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Stelawliet on 17/9/25.
 */
public class SdfDemo {
    public static void main(String[] args) {
        Date  date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2017-09-09 12:12:11";
        try {
             date =  simpleDateFormat.parse(s);
            System.out.println(date);
            System.out.println(date.getHours());
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(date.getTime());
            System.out.println(calendar);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
