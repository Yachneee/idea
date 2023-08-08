package day2_808.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise4_1 {
    //          相比Exercise4,是去重后第n大的数
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
        //遍历数组，获取a去重后的数组长度l
        int l=1;
        for (int i = 1; i < a.length; i++) {
            boolean same=false;
            for (int j = 0; j <a.length && j!=i ; j++) {
                if(a[i]==a[j]){
                    same=true;
                    break;
                }
            }
            if(!same){
                l++;
            }
        }
        System.out.println(l);
        //使用选择排序将a降序后存进aSort0，并输出
        int[] aSort0=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aSort0[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            int current=aSort0[i];
            int maxIndex=i;
            for (int j = i+1; j < a.length ; j++) {
                if(aSort0[j]>aSort0[maxIndex]){
                    maxIndex=j;
                }
            }
            aSort0[i]=aSort0[maxIndex];
            aSort0[maxIndex]=current;
        }
        for (int as : aSort0) {
            System.out.print(as+"\t");
        }
        System.out.println();
        //遍历数组，将aSort0去重后存进aSort，并输出
        int[] aSort=new int[l];
        int index=0;
        for (int i = 0; i < aSort0.length; i++) {
            boolean unique=true;
            for (int j = 0; j < aSort0.length && j!=i; j++) {
                if(aSort0[i]==aSort0[j]){
                    unique=false;
                    break;
                }
            }
            if(unique){
                aSort[index]=aSort0[i];
                index++;
            }
        }
        for (int as : aSort) {
            System.out.print(as+"\t");
        }
        System.out.println();
        //从键盘获取n
        System.out.print("请输入一个小于等于 "+l+" 的正整数n：");
        int n = sc.nextInt();
        //输出第n大的数
        System.out.println("数组a中第n大的数为："+aSort[n-1]);
    }
}
