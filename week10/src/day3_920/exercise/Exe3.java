package day3_920.exercise;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 */
public class Exe3 {
    //编写一个Java程序，使用线程池来并行计算一个大数组的元素之和。确保线程池中的线程能够正确协作
    private static final int ARRAY_SIZE = 1000000;
    private static final int NUM_THREADS = 4; // 可以根据需要调整线程数量

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }
        // 创建线程池
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        ArraySumTask.setResultArraySize(NUM_THREADS);
        // 计算每个子数组的和
        int subArraySize = ARRAY_SIZE / NUM_THREADS;
        int startIndex = 0;
        long totalSum = 0;
        for (int i = 0; i < NUM_THREADS; i++) {
            int endIndex = startIndex + subArraySize;
            if (i == NUM_THREADS - 1) {
                endIndex = ARRAY_SIZE; // 最后一个子数组可能更小
            }

            int[] subArray = new int[endIndex - startIndex];
            System.arraycopy(array, startIndex, subArray, 0, endIndex - startIndex);

            // 提交任务计算子数组的和
            executor.submit(new ArraySumTask(subArray));

            startIndex = endIndex;
        }

        // 关闭线程池
        executor.shutdown();

        try {
            // 等待所有任务完成
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//         获取并累加每个子数组的和
        for (int i = 0; i < NUM_THREADS; i++) {
            totalSum += ArraySumTask.getResult(i);
        }
        System.out.println("总和为: " + totalSum);
    }
}
class ArraySumTask implements Runnable {
    private int[] array;
    private static long[] results;
    private static int index;
    public ArraySumTask(int[] array) {
        this.array = array;
    }
    @Override
    public synchronized void run() {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        results[index++] = sum;
        System.out.println("第"+(index)+"个线程计算数组第"+(index)+"部分，结果为："+sum);
    }
    public static void setResultArraySize(int size) {
        results = new long[size];
    }
    public static long getResult(int i) {
        return results[i];
    }
}
