package day5_811.exercise;

import java.util.Scanner;

public class Exercise3 {
    /*判断素数
     编写一个方法，接受一个整数作为参数，并判断它是否为素数（质数） */
    public static String prime(int num){
        boolean b=true;
        for (int i =2 ; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                b=false;
                break;
            }
        }
        return b ? "是素数" : "不是素数";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n=sc.nextInt();
        System.out.println(n+prime(n));
    }
}
