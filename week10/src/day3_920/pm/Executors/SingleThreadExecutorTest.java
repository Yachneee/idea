package day3_920.pm.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 */
public class SingleThreadExecutorTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            int num=i;
            service.execute(()-> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(num);

            });
        }
        for (int i = 5; i < 10; i++) {
            int num=i;
            service.submit(()-> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(num);

            });
        }
        service.shutdown();
    }
}
