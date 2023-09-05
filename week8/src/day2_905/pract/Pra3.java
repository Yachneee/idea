package day2_905.pract;

import java.util.Vector;

public class Pra3 {
    static Vector intSet=new Vector();
    public static int countTime(int num){
        int count=0;
        for (Object o : intSet) {
            if(o.equals(num)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        intSet.add(5);
        intSet.add(3);
        intSet.add(6);
        intSet.add(5);
        intSet.add(3);
        intSet.add(5);
        intSet.add(4);
        System.out.println("5在整数集intSet中出现的次数为："+countTime(5));
        System.out.println("3在整数集intSet中出现的次数为："+countTime(3));
        System.out.println("1在整数集intSet中出现的次数为："+countTime(1));
        System.out.println("4在整数集intSet中出现的次数为："+countTime(4));
        for (Object o : intSet) {
            System.out.print(o+"  ");
        }
    }
}
