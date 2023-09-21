package day4_921.UDP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class SendFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("客户端启动成功!");
        System.out.print("请输入指定主机地址：");
        String name = sc.next();
        System.out.print("请输入指定端口号：");
        int port=sc.nextInt();
        try (DatagramSocket socket = new DatagramSocket(9925)) {
            while (true) {
                System.out.print("你要发送(1.文件,2.字符)：");
                int type = sc.nextInt();
                if (type == 1) {
                    System.out.print("请输入文件路径：");
                    File file = new File(sc.next());
                    System.out.println(file.getName());
                    System.out.print("开始发送文件。。。");
                    try (FileInputStream in = new FileInputStream(file)) {
                        byte[] fileDataBytes = in.readAllBytes();
                        DatagramPacket filePacket = new DatagramPacket(fileDataBytes, 0, fileDataBytes.length, InetAddress.getByName(name), port);
                        socket.send(filePacket);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());;
                    }
                    System.out.println("发送文件成功");
                } else {
                    System.out.print("you say：");
                    String message = sc.next();
                    if("exit".equals(message)){
                        System.out.println("停止发送");
                        break;
                    }
                    byte[] messageBytes = message.getBytes();
                    DatagramPacket messagePacket = new DatagramPacket(messageBytes, 0, messageBytes.length, InetAddress.getByName(name), port);
                    socket.send(messagePacket);
                }
                byte[] receiveBytes=new byte[1024*1024];
                DatagramPacket receive=new DatagramPacket(receiveBytes,0,receiveBytes.length);
                socket.receive(receive);
                String answer=new String(receiveBytes,0,receive.getLength());
                System.out.println(receive.getAddress().getHostAddress()+" say："+answer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}