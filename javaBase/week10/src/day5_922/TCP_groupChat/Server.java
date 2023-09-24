package day5_922.TCP_groupChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 目标：完成TCP通信快速入门-服务端开发：要求实现与多个客户端同时通信。
 * @author Administrator
 */
public class Server {
    public static List<Socket> onLineSockets=new ArrayList<>();
    public static void main(String[] args){
        System.out.println("-----服务端启动成功-------");
        // 1、创建ServerSocket的对象，同时为服务端注册端口。
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                // 2、使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
                Socket socket = serverSocket.accept();
                //3、在线的客户端(onLineSockets)添加socket
                onLineSockets.add(socket);
                System.out.println("有人上线了：" + socket.getRemoteSocketAddress());
                // 3、把这个客户端对应的socket通信管道，交给一个独立的线程负责处理。
                new ServerReaderThread(socket).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}