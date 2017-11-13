package SockesDemo.ThreadDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Stelawliet on 17/9/30.
 */
public class User{

    public User(String ip, int HostPort) {
        this.HostIp = ip;
        this.HostPort = HostPort;
    }

    public User(int HostPort) {
        this.HostPort = HostPort;

    }

    private String HostIp;

    private int HostPort;

    private InetAddress inetAddress;


    public String getHostIp() {


        return inetAddress.getHostAddress();
    }

    public void setHostIp(String ip) {
        this.HostIp = ip;
    }

    public int getHostPort() {
        return HostPort;
    }

    public void setHostPort(int port) {
        this.HostPort = port;
    }

}
