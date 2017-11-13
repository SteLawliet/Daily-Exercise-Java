package SockesDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Stelawliet on 17/9/28.
 */
public class mServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);

        Socket socket0 = serverSocket.accept();

        InputStream inputStream = socket0.getInputStream();

        String ip = socket0.getLocalAddress().getHostName();
        byte[] bytes = new byte[1024];
        int port  = socket0.getPort();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int len = 0;
                    try {
                        len = inputStream.read(bytes);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("from-" + ip + new String(bytes, 0, len) + "----port----" + port);
                    OutputStream outputStream = null;
                    try {
                        outputStream = socket0.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Date date = new Date(System.currentTimeMillis());
                    String s = "mServer already receive the message----" + date;
                    try {
                        outputStream.write(s.getBytes());
                        outputStream.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        thread.start();

    }
}
