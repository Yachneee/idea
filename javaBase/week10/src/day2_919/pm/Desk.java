package day2_919.pm;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Desk {
    List<String> list=new ArrayList<>();
    long l;
    boolean isFirst=true;
    @SneakyThrows
    public synchronized void cook(){
        while(true){
            if(isFirst){
                l = System.currentTimeMillis();
                isFirst=false;
            }
            if(list.isEmpty()){
                String patty=System.currentTimeMillis()+"";
                list.add(patty);
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"做了一个包子："+patty);
//                notify();
            }else{
                wait(200);
            }
            if(System.currentTimeMillis()-l>=300000){
                System.out.println("已经5min了，拜拜");
                System.exit(1);
            }
        }
    }
    @SneakyThrows
    public synchronized void eat(){
        while(true){
            if(list.isEmpty()){
                wait(200);
            }else{
                String patty=list.remove(0);
                Thread.sleep(1000);
                System.out.println("..."+Thread.currentThread().getName()+"吃了一个包子："+patty);
//                notify();
            }
            if(System.currentTimeMillis()-l>=300000){
                System.out.println("已经5min了，拜拜");
                System.exit(1);
            }
        }
    }
}
class PattyTest{
    @SneakyThrows
    public static void main(String[] args) {
        Desk desk=new Desk();
        Thread cook1=new Thread((()-> desk.cook()),"厨师1");
        Thread cook2=new Thread((()-> desk.cook()),"厨师2");
        Thread cook3=new Thread((()-> desk.cook()),"厨师3");
        Thread glutton1=new Thread((()-> desk.eat()),"吃货1");
        Thread glutton2=new Thread((()-> desk.eat()),"吃货2");
        cook1.start();
        cook2.start();
        cook3.start();
        glutton1.start();
        glutton2.start();
    }
}
