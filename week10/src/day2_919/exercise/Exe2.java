package day2_919.exercise;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Random;

/**
 * @author Administrator
 */
public class Exe2 {
    //编写一个多线程程序
    //可以并行处理大量文本文件。每个线程负责读取一个文件，进行处理，然后将结果写入输出文件
    static File folder=new File("io","919");

    static int count;
    static FileOutputStream out;

    static {
        try {
            out = new FileOutputStream("io/919merge.txt",true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 写一个包含10个文件的文件夹，每一个文件夹里有一串字符串
     */
    @SneakyThrows
    public synchronized static void writeFolder(){
        Random r=new Random();
        File f=new File(folder,++count+".txt");
        try(FileOutputStream out=new FileOutputStream(f)){
            for (int i = 0; i < r.nextInt(100); i++) {
                out.write((char)((i%26+97)));
            }
        }
    }
    @SneakyThrows
    public synchronized static void writeSplit(FileInputStream in){
        byte[] bytes = in.readAllBytes();
        String str=new String(bytes);
        str=str.toUpperCase()+"\n";
        out.write(str.getBytes());
    }

    @SneakyThrows
    public static void main(String[] args) {
        if(!folder.exists()){
            folder.mkdirs();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(()->writeFolder(),"第"+i+"个线程").start();
        }
        File[] files = folder.listFiles((f)->f.getName().endsWith(".txt"));
        if (files != null) {
            for (File f : files) {
                new Thread(() -> {
                    try (FileInputStream in = new FileInputStream(f)) {
                        writeSplit(in);
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                }).start();
            }
        }
        out.flush();
        out.close();
    }
}
