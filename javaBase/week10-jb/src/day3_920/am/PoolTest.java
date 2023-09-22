package day3_920.am;

import java.util.List;
import java.util.concurrent.*;

/**
 * @author Administrator
 */
public class PoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,
                5,
                3000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 0; i < 11; i++) {
            int num=i;
            pool.execute(()-> System.out.println(Thread.currentThread().getName() + "  执行任务-->" + num));
        }
        List<Runnable> runs = pool.shutdownNow();
        runs.forEach((o)->new Thread(o).start());
    }

}
