package day2_808.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //给定一个整数数组，输入一个值 n, 输出数组中第 n 大的数。
        //动态初始化一个长为20的数组，并随机生成数据后输出
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int[] a=new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(50);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        //使用选择排序将a降序后存进aSort，并输出
        int[] aSort=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aSort[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            int current=aSort[i];
            int maxIndex=i;
            for (int j = i+1; j < a.length ; j++) {
                if(aSort[j]>aSort[maxIndex]){
                    maxIndex=j;
                }
            }
            aSort[i]=aSort[maxIndex];
            aSort[maxIndex]=current;
        }
        for (int as : aSort) {
            System.out.print(as+"\t");
        }
        System.out.println();
        //从键盘获取n
        System.out.print("请输入一个小于等于 "+a.length+" 的正整数n：");
        int n = sc.nextInt();
        //输出第n大的数
        System.out.println("数组a中第n大的数为："+aSort[n-1]);
    }
}
