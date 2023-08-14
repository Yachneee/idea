package day1_814;

import java.util.Scanner;

public class ResolveNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num= sc.nextInt();
        System.out.print(num+"= 1");
        divisor(num);
    }

    public static boolean prime(int d){
        for (int i = 2; i < d; i++) {
            if(d%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean divisor(int num,int d){
        return num%d==0;
    }
    public static int divisor(int num){
        for (int i = 2; i <= num; i++) {
            if(prime(i)&&divisor(num,i)){
                System.out.print("*"+i);
                return divisor(num/i);
            }
        }
        return 1;
    }
}
