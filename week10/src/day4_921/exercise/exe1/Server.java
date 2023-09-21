package day4_921.exercise.exe1;

import lombok.SneakyThrows;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class Server {
    //实现简单的TCP一发一收
    public static void main(String[] args) {
        Socket acceptSocket;
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            acceptSocket = serverSocket.accept();
            InputStream in = acceptSocket.getInputStream();
            byte[] bytes = new byte[1024*1024];
            int read;
            StringBuilder str = new StringBuilder();
            while ((read = in.read(bytes)) != -1) {
                str.append(new String(bytes, 0, read));
                System.out.println(acceptSocket.getInetAddress().getHostAddress()+"  say："+str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
