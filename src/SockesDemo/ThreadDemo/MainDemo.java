package SockesDemo.ThreadDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class MainDemo {
    public static void main(String[] args) throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                UserImpl user0 = new UserImpl(9922);
                //user0.SignIn("192",9922);
                user0.ChatWith(ip,9933);
                user0.Send("hello 9933");
                System.out.println(user0.Receive());
            }
        });

        Thread thread2 =  new Thread(new Runnable() {
            @Override
            public void run() {
                UserImpl user1 = new UserImpl(9933);
                //user1.SignIn("192",9933);
                user1.ChatWith(ip,9922);
                user1.Send("hello 9933");
                System.out.println(user1.Receive());
            }
        });

        thread1.start();
        thread2.start();

    }
}
