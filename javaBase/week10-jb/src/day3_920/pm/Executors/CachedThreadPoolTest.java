package day3_920.pm.Executors;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Administrator
 */
public class CachedThreadPoolTest {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService caService = Executors.newCachedThreadPool();
        caService.execute(()-> System.out.println(Thread.currentThread().getName()));
        Future<?> submit1= caService.submit(() -> System.out.println(Thread.currentThread().getName()));
        System.out.println(submit1.get());
        Future<Integer> submit2 = caService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return 1;
        });
        System.out.println(submit2.get());
        caService.shutdown();
    }
}
