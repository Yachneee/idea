package day4_921.UDP;

import lombok.SneakyThrows;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Client {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("客户端启动成功。。");
        System.out.print("请输入IP地址：");
        String name = sc.next();
        System.out.print("请输入端口号：");
        int port=sc.nextInt();
        while(true){
            try(DatagramSocket socket=new DatagramSocket(9925)) {
                System.out.print("you say：");
                String message = sc.next();
                if("exit".equals(message)){
                    break;
                }
                byte[] messageBytes=message.getBytes();
                DatagramPacket packet=new DatagramPacket(messageBytes,0,messageBytes.length, InetAddress.getByName(name),port);
                socket.send(packet);
                byte[] answerBytes=new byte[1024*1024];
                DatagramPacket receive=new DatagramPacket(answerBytes,0,answerBytes.length);
                socket.receive(receive);
                String answer=new String(answerBytes,0,receive.getLength());
                System.out.println(receive.getAddress().getHostAddress()+" say："+answer);
            } catch (SocketException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
