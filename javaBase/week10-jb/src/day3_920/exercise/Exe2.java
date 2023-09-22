package day3_920.exercise;

/**
 * @author Administrator
 */
import lombok.SneakyThrows;

import java.util.concurrent.*;

public class Exe2 {
    private static final int DESK_SIZE = 1;
    private static final int COOKER_NUM = 3;
    private static final int EATER_NUM = 2;

    private static BlockingQueue<String> desk = new ArrayBlockingQueue<>(DESK_SIZE);

    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(COOKER_NUM + EATER_NUM);
        ExecutorService executor=new ThreadPoolExecutor(COOKER_NUM + EATER_NUM,COOKER_NUM + EATER_NUM,0,TimeUnit.SECONDS,new ArrayBlockingQueue<>(5));

        for (int i = 0; i < COOKER_NUM; i++) {
            executor.execute(new Cooker(i+1));
        }

        for (int i = 0; i < EATER_NUM; i++) {
            executor.execute(new Eater(i+1));
        }
        executor.shutdown();
    }

    static class Cooker implements Runnable {
        private int id;

        public Cooker(int id) {
            this.id = id;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (Cooker.class){
                    Thread.sleep(500);
                    String pasty = "包子 " + System.currentTimeMillis();
                    System.out.println("Cooker " + id + " cooked: " + pasty);
                    desk.put(pasty);
                }
            }
        }
    }

    static class Eater implements Runnable {
        private int id;

        public Eater(int id) {
            this.id = id;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (Eater.class){
                    Thread.sleep(500);
                    String pasty = desk.take();
                    System.out.println("......Eater " + id + " ate: " + pasty);
                }
            }
        }
    }
}
