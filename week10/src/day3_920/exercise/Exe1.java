package day3_920.exercise;

import lombok.SneakyThrows;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Administrator
 */
public class Exe1 {
    //使用阻塞队列实现消费者生产者问题
    public static void main(String[] args) {
        ArrayBlockingQueue<String> bq=new ArrayBlockingQueue<>(1);
        new CookThread("厨师1",bq).start();
        new CookThread("厨师2",bq).start();
        new CookThread("厨师3",bq).start();
        new EatThread("吃货1",bq).start();
        new EatThread("吃货2",bq).start();
    }
}
class CookThread extends Thread{
    private ArrayBlockingQueue<String> bq;
    CookThread(String name,ArrayBlockingQueue<String> bq){
        super(name);
        this.bq=bq;
    }
    @SneakyThrows
    public void run(){
        while (true){
            synchronized (CookThread.class){
                String pasty=System.currentTimeMillis()+"";
                Thread.sleep(1000);
                bq.put(pasty);
                System.out.println(Thread.currentThread().getName()+" 制作了一个包子："+pasty);
            }
        }
    }
}
class EatThread extends Thread{
    private ArrayBlockingQueue<String> bq;
    EatThread(String name,ArrayBlockingQueue<String> bq){
        super(name);
        this.bq=bq;
    }
    @SneakyThrows
    public void run(){
        while (true){
            synchronized (EatThread.class){
                Thread.sleep(1000);
                String pasty = bq.take();
                System.out.println("......"+Thread.currentThread().getName()+" 吃了一个包子"+pasty);
            }
        }
    }
}