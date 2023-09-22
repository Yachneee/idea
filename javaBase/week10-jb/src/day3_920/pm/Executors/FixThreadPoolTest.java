package day3_920.pm.Executors;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Administrator
 */
public class FixThreadPoolTest {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService fixService = Executors.newFixedThreadPool(10);
        fixService.execute(()-> System.out.println(Thread.currentThread().getName()));
        Future<?> submit1= fixService.submit(() -> System.out.println(Thread.currentThread().getName()));
        System.out.println(submit1.get());
        Future<Integer> submit2 = fixService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return 1;
        });
        System.out.println(submit2.get());
        fixService.shutdown();
    }
}
