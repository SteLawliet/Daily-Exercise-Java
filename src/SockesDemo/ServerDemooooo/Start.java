package SockesDemo.ServerDemooooo;

import java.io.IOException;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class Start {
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ServerThread.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                TestServer.start();
            }
        }).start();


    }
}
