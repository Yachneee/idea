package day5_922.MulticlientThread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class Server {
    public static void main(String[] args) {
        System.out.println("服务端启动成功,等待连接...");
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true){
                Socket accept = serverSocket.accept();
                System.out.println(accept.getInetAddress().getHostAddress()+":"+accept.getPort() + " 连接进来了");
                new SocketThread(accept).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class SocketThread extends Thread{
    private Socket socket;
    public SocketThread(Socket socket){
        this.socket=socket;
    }
    public void run(){
        try (DataInputStream dataIn = new DataInputStream(socket.getInputStream())) {
            String message = dataIn.readUTF();
            System.out.println(socket.getInetAddress().getHostAddress()+"："+socket.getPort()+" say："+message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}