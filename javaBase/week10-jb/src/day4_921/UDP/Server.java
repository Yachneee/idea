package day4_921.UDP;

import lombok.SneakyThrows;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Server {
//    @SneakyThrows
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("服务端启动成功。。。");
        while (true){
            try (DatagramSocket socket = new DatagramSocket(8888)) {
                byte[] answerByte = new byte[1024 * 1024];
                DatagramPacket receive = new DatagramPacket(answerByte, 0, answerByte.length);
                socket.receive(receive);
                String answer=new String(answerByte,0,receive.getLength());
                System.out.println(receive.getAddress().getHostAddress()+" say："+answer);
                System.out.print("you say：");
                String ask = sc.nextLine();
                byte[] askBytes = ask.getBytes();
                DatagramPacket send = new DatagramPacket(askBytes, 0, askBytes.length, receive.getAddress(), receive.getPort());
                socket.send(send);
            } catch (SocketException e) {
                System.out.println("接受失败。");
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
