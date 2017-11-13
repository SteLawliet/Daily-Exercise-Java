package SockesDemo.ThreadDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class MainDemo3 {
    public static void main(String[] args) {
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        UserImpl user0 = new UserImpl(9933);
        //user0.SignIn("192",9922);
        user0.ChatWith(ip,9922);
        user0.Send("hello 9933");
        System.out.println(user0.Receive());
    }
}
