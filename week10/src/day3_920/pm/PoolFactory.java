package day3_920.pm;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 */
public class PoolFactory {
    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,
                5,
                3000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5),
                new MyThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 0; i < 11; i++) {
            int num=i;
            pool.execute(()-> System.out.println(Thread.currentThread().getName() + "  执行任务-->" + num));
        }
        pool.shutdown();
    }
}
class MyThreadFactory implements ThreadFactory {
    AtomicInteger ato=new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, "第"+ato.getAndIncrement()+"个线程");
    }
}