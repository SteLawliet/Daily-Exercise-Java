package SockesDemo.ServerDemooooo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class ServerThread implements Runnable {
    private Socket socket;
    private ChatRoom chatRoom;
    public static String Message;


    public ServerThread(Socket socket,ChatRoom chatRoom) {
            this.socket = socket;
            this.chatRoom =chatRoom;
    }


    @Override
    public void run() {

        try {
            InputStream inputStream = socket.getInputStream();
            String ip = socket.getLocalAddress().getHostName();
            byte[] bytes = new byte[1024];
            int port  = socket.getPort();
            int len = 0;
            len = inputStream.read(bytes);
            chatRoom.ServerText.append("\r\n");
            chatRoom.ServerText.append("from-" + ip +"--"+ "--port--" + port+"\r\n");
            chatRoom.ServerText.append(new String(bytes, 0, len));
//            System.out.println("from-" + ip +"--"+ "--port--" + port);
//            System.out.println( new String(bytes, 0, len));
            System.out.println(chatRoom.ServerText.getText());

        } catch (IOException e) {
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(Thread.currentThread().getName()+"Sing out");
        }

        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Calendar calendar =Calendar.getInstance();
//        calendar.setTimeInMillis(System.currentTimeMillis());
//        String s = "send the message-@" + calendar.get(Calendar.HOUR)+":"+calendar.get(MINUTE)+":"+calendar.get(SECOND);

        String s = chatRoom.ServerText.getText();
        try {
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void start()throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setTitle("ServerSocket");
        chatRoom.setVisible(true);

        while (true){
            Socket socket = serverSocket.accept();

            new Thread(new  ServerThread(socket,chatRoom)).start();
        }

        }

    }


