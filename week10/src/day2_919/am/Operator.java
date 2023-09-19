package day2_919.am;

import lombok.SneakyThrows;

/**
 * @author Administrator
 */
public class Operator {
    private int a=0;
    public void plus(){
        for (int i = 0; i < 10000; i++) {
            a++;
        }
    }
    public void minus(){
        for (int i = 0; i <10000 ; i++) {
            a--;
        }
    }

    public int getA() {
        return a;
    }
}
class OpeTest{
    @SneakyThrows
    public static void main(String[] args) {
        Operator ope=new Operator();
        Thread plus=new Thread(()-> {
            synchronized(ope){
                ope.plus();
            }} );
        Thread minus=new Thread(()-> {synchronized(ope){ope.minus();}});
        plus.start();
        minus.start();
        plus.join();
        minus.join();
        System.out.println(ope.getA());
    }
}
