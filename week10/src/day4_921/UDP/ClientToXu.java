package day4_921.UDP;

import lombok.SneakyThrows;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientToXu {
    @SneakyThrows
    public static void main(String[] args) {
        try {
            System.out.println("客户端");
            DatagramSocket socket=new DatagramSocket(9925);
            String str="Hello XuJing!";
            InetAddress xu=InetAddress.getByName("10.0.3.193");
            DatagramPacket packet=new DatagramPacket(str.getBytes(),0,str.length(),xu,8888);
            socket.send(packet);
            System.out.println("客户端发送成功");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
