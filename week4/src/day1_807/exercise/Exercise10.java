package day1_807.exercise;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        //现有一个int 数组，数组中有十个元素。将数组反转后输出。

        //直接定义
//        int[] a={0,31,45,30,21,11,30,44,55,90};

        //从键盘获取
//        Scanner sc=new Scanner(System.in);
//        int[] a=new int[10];
//        System.out.print("请输入10个整数：");
//        for (int i = 0; i < a.length; i++) {
//            a[i]=sc.nextInt();
//        }

        //随机
        Random r=new Random();
        int[] a=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(100)+1;
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        int[] a_copy=new int[10];
        for (int i = 0; i < a.length; i++) {
            a_copy[i]=a[a.length-i-1];
            System.out.print(a_copy[i]+"\t");
        }
    }
}
