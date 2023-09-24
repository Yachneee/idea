package day4_921.exercise.exe3;

import com.alibaba.fastjson2.JSON;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //接收端接收到数据后，向发送端指定端口发送一条 接收到信息的反馈
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            Socket accept = serverSocket.accept();
            InputStream in = accept.getInputStream();
            byte[] bytes = new byte[1024*1024*1024];
            int read;
            while ((read = in.read(bytes)) != -1) {
                String str=new String(bytes,0,read);
                Message message = JSON.parseObject(str, Message.class);
                if("text".equals(message.getFormat())){
                    System.out.println(message);
                }else{
                    File file=new File("io/921",message.getTime()+"."+message.getFormat());
                    try(FileOutputStream out=new FileOutputStream(file)){
                        String content=message.getContent();
                        out.write(content.getBytes());
                    }
                }
                Socket send=new Socket(accept.getInetAddress().getHostAddress(),message.getReplyPort());
                send.getOutputStream().write("收到！".getBytes());
                send.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
