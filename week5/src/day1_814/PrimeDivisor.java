package day1_814;

import java.util.Scanner;

public class PrimeDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num=sc.nextInt();
        System.out.print(num+"的素因子有：");
        for (int i = 2; i <= num; i++) {
            if(divisor(num,i)&&prime(i)){
                System.out.print(i+"\t");
            }
        }
    }
    public static boolean divisor(int num,int d){
        return num%d==0;
    }
    public static boolean prime(int d){
        for (int i = 2; i <= d/2; i++) {
            if(d%i==0){
                return false;
            }
        }
        return true;
    }
}
