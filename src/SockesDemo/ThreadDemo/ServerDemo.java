package SockesDemo.ThreadDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = null;
        Socket socket = null;
        serverSocket = new ServerSocket(23235);
        Socket socket0 = new Socket(InetAddress.getLocalHost(),23235);

        OutputStream outputStream0 = socket0.getOutputStream();
        outputStream0.write("hello".getBytes());

        socket = serverSocket.accept();
        InputStream inputStream =  socket.getInputStream();
        InputStream inputStream1 = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

    }}



