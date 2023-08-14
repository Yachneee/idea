package day1_814;

import java.util.Scanner;

public class ResolveNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num= sc.nextInt();
        System.out.print(num+"=");
        divisor(num);
        divisor1(num);
    }

    public static void divisor(int num){
        for (int i = num/2; i >=2;) {
            if(num%i==0){
                System.out.print(num/i+"*");
                num=i;
                i=num/2;
//                divisor(num);
            }else{ i--;}
        }
        System.out.print(num);
    }
    public static void divisor1(int num){
        for (int i = 2; i <=num/2;i++) {
            if(num%i==0){
                System.out.print(i+"*");
                num=num/i;
                i=1;
            }
        }
        System.out.print(num);
    }
}
