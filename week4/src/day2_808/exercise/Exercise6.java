package day2_808.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //给定一个整数数组，输入位置 n 和值 k。将值 k 插入到数组的第 n 位并输出新数组的每一个元素。
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int[] a=new int[20];
        System.out.println("随机生成的长度为 "+a.length+" 的100以内整数数组为：");
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(101);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.print("请输入位置n(n<"+a.length+")：");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("请输入值k：");
        int k = sc.nextInt();
        System.out.println();
        a[n-1]=k;
        for (int arr : a) {
            System.out.print(arr+"\t");
        }
    }
}
