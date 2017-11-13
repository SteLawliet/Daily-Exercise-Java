package SocketDemo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Stelawliet on 17/10/1.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        File file0 = new File("ss.txt");
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server already Start:");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();


        while (true) {
            Socket socket = serverSocket.accept();
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {

                    // Thread.currentThread().setName("ID"+name);
                    InputStream inputStream = null;

                    try {
                        inputStream = socket.getInputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                        String Message = "";
                        try {
                            while (true) {

                                System.out.println("ready receive...");
                                byte[] bytes = new byte[1024];
                                int len = inputStream.read(bytes);
                                if (len==-1){
                                    System.out.println("--port--" + socket.getPort()+"#end");
                                    return;
                                }
                                Message = new String(bytes, 0, len);
                                System.out.println("read...");
                                //bufferedReader.
                                String Info = "from-" + Thread.currentThread().getName()
                                        + "--" + "--port--" + socket.getPort();
                                System.out.println(Info);
                                System.out.println(Message);

                                PrintWriter printWriter0
                                        = new PrintWriter(new FileWriter(file0, true));
                                printWriter0.append(Info + "\r\n" + Message);
                                printWriter0.append("\r\n");
                                printWriter0.flush();

                                OutputStream outputStream = socket.getOutputStream();
                                PrintWriter printWriter = new PrintWriter(outputStream);
                                printWriter.print("Receive the Message@" + Message);
                                printWriter.flush();


                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            });
        }
    }
}
