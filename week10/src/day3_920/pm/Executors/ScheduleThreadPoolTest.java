package day3_920.pm.Executors;

import lombok.SneakyThrows;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 */
public class ScheduleThreadPoolTest {
    @SneakyThrows
    public static void main(String[] args) {
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(3);
        //延迟initialDelay unit后执行一次（只一次）
//        ScheduledFuture<?> futureRun = scheduled.schedule(() -> System.out.println(Thread.currentThread().getName()), 1, TimeUnit.SECONDS);
//        System.out.println(futureRun.get());
//        ScheduledFuture<Integer> futureCall = scheduled.schedule(() -> {
//            System.out.println(Thread.currentThread().getName());
//            return 1;
//        }, 1, TimeUnit.SECONDS);
//        System.out.println(futureCall.get());
        //延迟initialDelay unit后执行一次，每隔 delay unit 执行一次
        scheduled.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ LocalTime.now());
        },1,2,TimeUnit.SECONDS);
        //延迟initialDelay unit后执行一次，之后每隔 上一个线程执行时间 + delay unit 执行一次
//        scheduled.scheduleWithFixedDelay(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+"-->"+ LocalTime.now());
//        },1,2,TimeUnit.SECONDS);
    }
}
