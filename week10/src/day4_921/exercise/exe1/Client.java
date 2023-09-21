package day4_921.exercise.exe1;

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
        OutputStream out = sendSocket.getOutputStream();
        System.out.print("you say：");
        String ask = sc.next();
        out.write(ask.getBytes());
        out.close();
    }
}
