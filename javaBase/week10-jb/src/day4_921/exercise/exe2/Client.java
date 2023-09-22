package day4_921.exercise.exe2;

import lombok.SneakyThrows;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Client {
    //实现简单的TCP多发多收
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try (Socket sendSocket = new Socket("localhost", 8888)) {
            System.out.println("客户端启动成功...");
            OutputStream out = sendSocket.getOutputStream();
            DataOutputStream dataOut=new DataOutputStream(out);
            InputStream in = sendSocket.getInputStream();
            DataInputStream dataIn=new DataInputStream(in);
            while (true) {
                System.out.print("you say：");
                String ask = sc.next();
                try {
                    dataOut.writeUTF(ask);
                    System.out.println("发送消息成功");
                    dataOut.flush();
                    String s = dataIn.readUTF();
                    System.out.println("服务端回复你了：" + s);
                } catch(IOException e) {
                    out.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
