package SockesDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Stelawliet on 17/9/28.
 */
public class Recever {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(12345,InetAddress.getLocalHost());

        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);

        datagramSocket.receive(datagramPacket);


        String s =new String(datagramPacket.getData(),0,datagramPacket.getLength());

        System.out.println(datagramPacket.getAddress().getHostName()+s+"@"+datagramPacket.getPort());
        System.out.println("socket"+datagramSocket.getPort()+"dp"+datagramPacket.getPort());


        System.out.println("-------------------------------------");

        byte[] resend = "already got".getBytes();

        datagramSocket.send(new DatagramPacket(resend,resend.length,InetAddress.getLocalHost(),9004));

        datagramSocket.close();
    }
}
