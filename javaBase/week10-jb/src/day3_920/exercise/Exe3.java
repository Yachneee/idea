package day3_920.exercise;

import lombok.SneakyThrows;

import java.util.concurrent.*;

/**
 * @author Administrator
 */
public class Exe3 {
    //编写一个Java程序，使用线程池来并行计算一个大数组的元素之和。确保线程池中的线程能够正确协作
    private static final int ARRAY_SIZE = 1000000;
    private static final int NUM_THREADS = 4; // 线程数量

    @SneakyThrows
    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }
        // 创建线程池
        ExecutorService executor = new ThreadPoolExecutor(NUM_THREADS,NUM_THREADS,0,TimeUnit.SECONDS,new ArrayBlockingQueue<>(5));
        //平均线程计算的数组长度
        int averageSize = ARRAY_SIZE / NUM_THREADS;
        long sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i+=averageSize) {
            // 提交任务计算子数组的和
            Future<Long> submit = executor.submit(new ArraySumCallable(array, i, Math.min(i+averageSize,ARRAY_SIZE)));
            sum+=submit.get(); // 每个线程计算结果的累加
        }
        // 关闭线程池
        executor.shutdown();
//         获取并累加每个子数组的和
        System.out.println("总和为: " + sum);
    }
}
class ArraySumCallable implements Callable<Long> {
    private int[] array;
    private int start;
    private int end;
    public ArraySumCallable(int[] array,int start,int end) {
        this.array = array;
        this.start=start;
        this.end=end;
    }
    @Override
    public synchronized Long call() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
