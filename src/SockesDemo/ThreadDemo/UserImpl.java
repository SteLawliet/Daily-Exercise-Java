package SockesDemo.ThreadDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class UserImpl{

    private User user;

    private ServerSocket serverSocket;

    private Socket SendSocket;

    private Socket ReceiveSocket;

    public UserImpl(int HostPort){
        try {
            this.serverSocket = new ServerSocket(HostPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void SignIn(String HostIp,int HostPort) {

    }

    public void ChatWith(String ip, int port) {

        try {
            this.SendSocket = new Socket(ip,port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Send(String message) {
        try {
            this.SendSocket.getOutputStream().write(message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String Receive() {
        try {
           this.ReceiveSocket = this.serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            len = this.ReceiveSocket.getInputStream().read(bytes,0,len);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes,0,len);
    }


    public void SignOut() {
        try {
            this.SendSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
