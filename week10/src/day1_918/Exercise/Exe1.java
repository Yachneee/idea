package day1_918.Exercise;

/**
 * @author Administrator
 */
public class Exe1 {
    public static void main(String[] args) {
        Thread threadOdd=new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                if(i%2==1){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        },"打印奇数");
        Thread threadEven=new MyThread1();
        threadEven.start();
        threadOdd.start();
    }
}
