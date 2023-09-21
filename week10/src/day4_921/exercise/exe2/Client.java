package day4_921.exercise.exe2;

import lombok.SneakyThrows;

import java.io.IOException;
import java.io.OutputStream;
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
            while (true) {
                OutputStream out = sendSocket.getOutputStream();
                System.out.print("you say：");
                String ask = sc.next();
                if ("end".equals(ask)) {
                    break;
                }
                out.write(ask.getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
