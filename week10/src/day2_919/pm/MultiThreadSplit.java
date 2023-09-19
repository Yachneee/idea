package day2_919.pm;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.CountDownLatch;

/**
 * @author Administrator
 */
public class MultiThreadSplit {
    @SneakyThrows
    public static void main(String[] args) {
        File target=new File("io/dt.gif");
        File dest=new File("io/threadSplit");
        FileInputStream in= new FileInputStream(target);
        if(!dest.exists()){
            dest.mkdirs();
        }
        CountDownLatch latch=new CountDownLatch(50);
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                threadSplit(in,dest,1024*2);
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("split end");

    }
    static int count=0;
    @SneakyThrows
    public static void threadSplit(FileInputStream in,File dest,long length){
        byte[] bytes=new byte[(int)length];
        int size=in.read(bytes);
        if((size)!=-1){
            File file=new File(dest,++count+".tmp");
            try(FileOutputStream out=new FileOutputStream(file)) {
                out.write(bytes,0,size);
            }
        }
    }
}
