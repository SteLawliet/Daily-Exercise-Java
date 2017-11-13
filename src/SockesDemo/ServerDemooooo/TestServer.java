package SockesDemo.ServerDemooooo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class TestServer {
    public static void start() {
        ChatRoom chatRoom = new ChatRoom();
        //BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
//        Socket socket = null;
//        OutputStream outputStream = null;
        JTextField sendMessage = chatRoom.getTextMessage();
        JButton send = chatRoom.getSendButton();

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Socket socket   = null;
                try {
                    socket = new Socket(InetAddress.getLocalHost(),12345);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(sendMessage.getText().getBytes());
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    len = socket.getInputStream().read(bytes);
//                    System.out.println(new String(bytes,0,len));
                    chatRoom.ServerText.setText(new String(bytes,0,len));

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                finally {
                    try {
                        socket.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                sendMessage.setText("");
                sendMessage.grabFocus();

            }
        });
        chatRoom.setTitle("TestSend");
        chatRoom.setVisible(true);


//        try {
//            socket = new Socket(InetAddress.getLocalHost(),12345);
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("port");
//        }
//        try {
//            outputStream = socket.getOutputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        while (true){
//            try {
//
//                socket   = new Socket(InetAddress.getLocalHost(),12345);
//                outputStream = socket.getOutputStream();
//
//               String string = BR.readLine();
//               if (string.equals("#end")){
//                   System.out.println("bye");
//                   break;}
//               else if (string==null|string.equals("")){
//                   continue;
//               } else{
//                   outputStream.write(string.getBytes());
//                   int len = 0;
//                   byte[] bytes = new byte[1024];
//                   len = socket.getInputStream().read(bytes);
//                   System.out.println(new String(bytes,0,len));
//
//               }
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }

    public static void main(String[] args) {
        start();
    }
}
