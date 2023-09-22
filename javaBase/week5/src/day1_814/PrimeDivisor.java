package day1_814;

import java.util.Scanner;

public class PrimeDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num=sc.nextInt();
        System.out.print(num+"的素因子有：");
//        for (int i = 2; i <= num; i++) {
//            if(divisor(num,i)&&prime(i)){
//                System.out.print(i+"\t");
//            }
//        }
        primeDivisor(num);
    }
    public static boolean divisor(int num,int d){
        return num%d==0;
    }
    public static boolean prime(int d){
        for (int i = 2; i < d; i++) {
            if(d%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeDivisor(int num){
        for(int i = 2; i <= num; i++){
            if(num%i==0 && prime(i)){
                System.out.print(i+"\t");
            }
        }
    }
}
