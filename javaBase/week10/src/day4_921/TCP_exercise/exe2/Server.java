package day4_921.TCP_exercise.exe2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Server {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("服务端启动成功，等待连接...");
            Socket acceptSocket = serverSocket.accept();
            System.out.println(acceptSocket.getInetAddress().getHostAddress()+"连接成功");
            InputStream in = acceptSocket.getInputStream();
            DataInputStream dataIn=new DataInputStream(in);
            OutputStream out=acceptSocket.getOutputStream();
            DataOutputStream dataOut=new DataOutputStream(out);
            while (true) {
                try {
                    String message = dataIn.readUTF();
                    System.out.println(acceptSocket.getPort()+"说："+message);
                    System.out.print("【系统】你想回复什么？");
                    String receive = sc.next();
                    dataOut.writeUTF(receive);
                    dataOut.flush();
                } catch (IOException e) {
                    in.close();
                    acceptSocket.close();
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
