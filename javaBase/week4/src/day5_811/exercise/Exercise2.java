package day5_811.exercise;

import jdk.jfr.Unsigned;

public class Exercise2 {
    /* 阶乘
     编写一个方法，接受一个正整数作为参数，并返回它的阶乘 */
    public static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }

    public static void main(String[] args){
        System.out.println(factorial(4));
    }
}
