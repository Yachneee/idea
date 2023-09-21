package day3_920.exercise;

import java.util.concurrent.*;

public class Exe4 {
    //使用ThreadPoolExecutor分别实现Executors
    //的newCachedThreadPool、FixedThreadPool还有SingleThreadExecutor并测试
    public static void main(String[] args) {
        ExecutorService cacService=new ThreadPoolExecutor(0,Integer.MAX_VALUE,60,
                TimeUnit.SECONDS,new SynchronousQueue<>());
        cacService.execute(()-> System.out.println(Thread.currentThread()));
        cacService.submit(()-> System.out.println(Thread.currentThread()));
        cacService.shutdown();
        ExecutorService fixService=new ThreadPoolExecutor(5,5,0,
                TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        fixService.execute(()-> System.out.println(Thread.currentThread()));
        fixService.submit(()-> System.out.println(Thread.currentThread()));
        fixService.shutdown();
        ExecutorService singleService=new ThreadPoolExecutor(1,1,0,
                TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
        singleService.execute(()-> System.out.println(Thread.currentThread()));
        singleService.submit(()-> System.out.println(Thread.currentThread()));
        singleService.shutdown();
    }
}
