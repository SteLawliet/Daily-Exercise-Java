package SockesDemo.ThreadDemo;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class ThreadSockets implements Runnable {
    private Socket socket;
    private String ip;
    private int port;

    public ThreadSockets(String ip, int port){
        try {
            this.socket = new Socket(ip,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }
}
