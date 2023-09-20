package day2_919.exercise;

import lombok.SneakyThrows;
public class Exe1 {
    //创建两个线程，一个线程负责打印数字，
    //另一个线程负责打印字母。确保它们交替执行，并使用线程通信来协调它们
    static class Print{
        @SneakyThrows
        public void printNum(){
            for (int i = 0; i < 100; i++) {
                synchronized (this){
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+"......"+i);
                    notify();
                    if(i<99){
                        wait();
                    }
                }
            }
        }
        @SneakyThrows
        public void printLetter(){
            for (int i = 0; i < 100; i++) {
                synchronized (this) {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+" 。。。"+(char)((i%26)+65));
                    notify();
                    if(i<99){
                        wait();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Print print=new Print();
        Thread num=new Thread(()->print.printNum(),"打印数字");
        Thread letter=new Thread(()->print.printLetter(),"打印字母");
        num.start();
        letter.start();
    }
}
