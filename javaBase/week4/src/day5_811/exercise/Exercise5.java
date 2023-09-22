package day5_811.exercise;

import java.util.Scanner;

public class Exercise5 {
    /*回文数
   编写一个方法，接受一个整数作为参数，判断它是否为回文数（正着读和倒着读都一样）
   */
    public static boolean huiWen(long num){
        long n=num;
        int i=1;
        while(true){ //判断num的位数
           n/=10;
           if(n==0){
             break;
           }
           i++;
        }
        int max=1;
        for (int j = 0; j < i-1; j++) {
           max*=10;
        }//例如：num=3223 max=1000
        long c=num/max; // c=3 （最高位）
        long a=num/10; //a=322
        long b=num%10; // b=3
        if(i==1 || a==b){  // 1（一位数字） 或者 11(两位数，且每位数字相等)
            return true;
        }else if(c==b){
            return(huiWen(num%max/10)); //如果最高位和最低位相等（34563），返回去掉最高和最低位的数字的huiWen方法结果huiWen(456)
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long num=sc.nextInt();
        System.out.println(num+"是回文数字吗？ "+huiWen(num));
    }
}
