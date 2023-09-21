package day4_921.exercise.exe2;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class Server {
    public static void main(String[] args) {
        Socket acceptSocket;
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            acceptSocket = serverSocket.accept();
            InputStream in = acceptSocket.getInputStream();
            byte[] bytes = new byte[1024];
            int read;
            while ((read = in.read(bytes)) != -1) {
                String str=new String(bytes,0,read);
                System.out.println(acceptSocket.getInetAddress().getHostAddress()+"  say："+str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
