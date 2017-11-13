package SockesDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Stelawliet on 17/9/28.
 */
public class UDPDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(9004);

        byte[] bytes ="hello UDP".getBytes();

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),12345);

        datagramSocket.send(datagramPacket);

        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData()));

        datagramSocket.close();
    }
}
