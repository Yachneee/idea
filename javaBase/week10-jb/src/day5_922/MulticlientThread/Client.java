package day5_922.MulticlientThread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入连接主机IP：");
        String host=sc.next();
        System.out.print("请输入端口号：");
        int port=sc.nextInt();
        try (Socket socket = new Socket(host, port);
             DataOutputStream dataOut=new DataOutputStream(socket.getOutputStream())) {
            System.out.println("客户端启动成功");
            System.out.print("你想说什么？");
            String msg = sc.next();
            dataOut.writeUTF(msg);
            System.out.println("发送消息成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
