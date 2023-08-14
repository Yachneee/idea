package day1_814;

import java.util.Scanner;

public class DiGuiFibo {
    public static int  numFibo(int num){
        if(num==1||num==2){
            return 1;
        }
        return numFibo(num-1)+numFibo(num-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num=sc.nextInt();
        System.out.println("第"+num+"个Fibo数是："+numFibo(num));
    }
}
