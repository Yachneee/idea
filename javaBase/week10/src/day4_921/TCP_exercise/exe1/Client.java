package day4_921.TCP_exercise.exe1;

import lombok.SneakyThrows;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Client {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Socket sendSocket=new Socket("localhost",8888);
        System.out.println("客户端启动成功...");
        OutputStream out = sendSocket.getOutputStream();
        System.out.print("you say：");
        String ask = sc.next();
        out.write(ask.getBytes());
        System.out.println("发送成功...");
        out.close();
        sendSocket.close();
    }
}
