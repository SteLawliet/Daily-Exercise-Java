package SockesDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Stelawliet on 17/9/28.
 */
public class mSocket {
    public static void main(String[] args) throws IOException {
        Socket socket0 = new Socket(InetAddress.getLocalHost(),12345);
//        int port0 = socket0.getLocalPort();
//        int port1 = socket0.getPort();

        OutputStream outputStream = socket0.getOutputStream();
        outputStream.write("HELLO TCP 4".getBytes());



//        InputStream inputStream = socket0.getInputStream();
//
//        String ip = socket0.getInetAddress().getHostName();
//
//        int port = socket0.getPort();
//
//        byte[] bytes =new byte[1024];
//
//        int len =  inputStream.read(bytes);
//
//        System.out.println("from-"+ip+ new String(bytes,0,len)+"port"+"  "+port);
//        System.out.println(port0+"---"+port1);

    }
}
