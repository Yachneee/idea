package day1_918.Exercise;

/**
 * @author Administrator
 */
public class MyThread1 extends Thread {
    @Override
    public void run(){
        this.setName("打印偶数");
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                System.out.println(this.getName()+":"+i);
            }
        }
    }
}
