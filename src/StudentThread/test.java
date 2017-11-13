package StudentThread;

/**
 * Created by Stelawliet on 17/9/26.
 */
public class test {
    public static void main(String[] args) {
        String string = "123";
        String[] strings = {"1122","2121"};
        change(string ,strings);
        System.out.println(string);
        System.out.println(strings);
    }

    public static void change(String s,String[] strings) {
        s ="0000";
        strings[0]="2222";

    }
}
