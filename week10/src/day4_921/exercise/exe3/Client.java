package day4_921.exercise.exe3;

import com.alibaba.fastjson2.JSON;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Client {
    //发送端:发送数据来源于键盘录入，直到输入 end 表示发送结束
    //
    //发送端要写一个专门接收响应的线程，用于接收对方的反馈接收端:死循环接收数据
    //
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入接收消息主机地址：");
//        String host=sc.next();
//        System.out.println("请输入端口号：");
//        int port=sc.nextInt();
        Message message=new Message();
        try (Socket client = new Socket("localhost", 8888);
             OutputStream out = client.getOutputStream()) {
            System.out.print("请输入接受回复的端口：");
            message.setReplyPort(sc.nextInt());
            ServerSocket serverSocket=new ServerSocket(message.getReplyPort());
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
            executor.execute(() -> {
                while (true) {
                    if(!client.isConnected()){
                        System.exit(1);
                        try {
                            client.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    try (Socket accept = serverSocket.accept();
                         InputStream inputStream = accept.getInputStream()) {
                        byte[] bytes = inputStream.readAllBytes();
                        String reply = new String(bytes);
                        System.out.println(reply);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            });
            while (true){
                Thread.sleep(1000);
                System.out.print("请输入发送数据：");
                String str=sc.next();
                if("end".equals(str)){
                    System.out.println("发送结束");
                    break;
                }
                message.setTime(LocalTime.now().toString());
                File file=new File(str);
                if(!file.exists()){
                    message.setFormat("text");
                    message.setContent(str);
                }else{
                    int index = str.lastIndexOf(".");
                    if(index!=-1){
                        message.setFormat(str.substring(index+1));
                    }else{
                        message.setFormat("Directory");
                    }
                    message.setContent(file);
                }
                String jsonString = JSON.toJSONString(message);
                out.write(jsonString.getBytes());
//                if(file.exists()&&file.isFile()){
//                    FileInputStream in=new FileInputStream(file);
//                    byte[] bytes = in.readAllBytes();
//                    out.write(bytes);
//                    in.close();
//                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

