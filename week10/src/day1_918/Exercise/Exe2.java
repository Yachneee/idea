package day1_918.Exercise;

import java.util.Objects;
import java.util.concurrent.FutureTask;

/**
 * @author Administrator
 */
public class Exe2 {
    public static void main(String[] args) {
        Thread.currentThread().setName("main");
        MyThread2 myThread2=new MyThread2();
        myThread2.setName("循环加一");
        myThread2.start();
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread2.interrupt();
    }

}
class MyThread2 extends Thread{
    public void run(){
        long i=1;
        while(!isInterrupted()){
            i+=1;
        }
        System.out.println(i);
    }
}