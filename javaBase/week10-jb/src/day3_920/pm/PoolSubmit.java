package day3_920.pm;

import lombok.SneakyThrows;

import java.util.concurrent.*;

/**
 * @author Administrator
 */
public class PoolSubmit {
    @SneakyThrows
    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,
                5,
                1000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5));
        Future<String> future1 = pool.submit(new MyCallable(4));
        Future<String> future2 = pool.submit(new MyCallable(10));
        Future<String> future3 = pool.submit(new MyCallable(100));
        Future<?> submit = pool.submit(() -> System.out.println(Thread.currentThread().getName()));
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(submit.get());
        pool.shutdown();
    }
}
class MyCallable implements Callable<String>{
    private int n;
    MyCallable(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+"计算[1-"+n+"]的结果为："+sum;
    }
}
