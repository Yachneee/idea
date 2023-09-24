package day5_922.TCP_groupChat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class ServerReaderThread extends Thread {
    private final Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dataIn = new DataInputStream(socket.getInputStream());
            while (true) {
                try {
                    String msg = dataIn.readUTF();
                    System.out.println(msg);
                    // 把这个消息分发给全部客户端进行接收。
                    sendMsgToAll(msg);
                } catch (Exception e) {
                    System.out.println("有人下线了：" + socket.getRemoteSocketAddress());
                    Server.onLineSockets.remove(socket);
                    dataIn.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
// 发送给全部在线的socket管道接收。
        for (Socket onLineSocket : Server.onLineSockets) {
            OutputStream os = onLineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
