package SocketDemo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Stelawliet on 17/10/6.
 */
public class Sockets {

    public static String In (Socket socket){
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            InputStream inputStream = socket.getInputStream();
           len =  inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes,0,len);
    }

    public static void Out (Socket socket,String string){
        try {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(string.getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),12345);
        Scanner scanner = new Scanner(System.in);
        String Message = "";
        while (!Message.endsWith("#end")) {
            System.out.println("enter the message:");
            String s = scanner.nextLine();
            Sockets.Out(socket, s);
            Message = Sockets.In(socket);
            System.out.println(Message);
        }
    }
}
