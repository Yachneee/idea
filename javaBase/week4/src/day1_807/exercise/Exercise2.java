package day1_807.exercise;

import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        //创建一个长度为6的整数数组。
        // 请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
        Random r=new Random();
        int[] a=new int[6];
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(100);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        for (int j : a) {
            sum += j;
        }
        System.out.println("这个长度为6的随机数组的和为："+sum);
    }
}
