package SocketDemo2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Stelawliet on 17/10/1.
 */
public class SocketPrint {
    public static void main(String[] args) throws IOException {
        Socket socket0;
        OutputStream outputStream ;
        InputStream inputStream;

        BufferedWriter bufferedWriter;
        Scanner scanner = new Scanner(System.in);

        String string = "";


        while (true) {
            socket0 = new Socket("192.168.100.2",12345);


                outputStream = socket0.getOutputStream();
                bufferedWriter =
                        new BufferedWriter(new OutputStreamWriter(outputStream));
                while (true) {
                    System.out.println("enter the message:");
                    string = scanner.nextLine();
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    System.out.println("已经发送");

                    inputStream = socket0.getInputStream();
                    System.out.println("正在接收");

                    byte[] bytes = new byte[1024];
                    int len = inputStream.read(bytes);
                    string = new String(bytes, 0, len);
                    System.out.println(string);

                    if (string.endsWith("#end")){
                        System.out.println("bye");
                        socket0.close();
                        bufferedWriter.close();
                        return;
                    }
                }



        }




    }
}
