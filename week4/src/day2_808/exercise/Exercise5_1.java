package day2_808.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise5_1 {
    //          相比Exercise5,是去重后第n大的数
    public static void main(String[] args) {
        //给定一个整数数组，输入一个值 n, 输出去掉数组中第 n 大的数后的数组。
        //动态初始化一个长为20的数组，并随机生成数据后输出
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int[] a=new int[20];
        System.out.println("数组a为：");
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(31);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        //使用选择排序将a降序后存进aSort
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
        System.out.println("数组a降序后的数组aSort为：");
        for (int as : aSort) {
            System.out.print(as+"\t");
        }
        System.out.println();
        //遍历数组，获取a去重后的数组长度l
        int l=1;
        for (int i = 1; i < a.length; i++) {
            int count=1;
            for (int j=i-1; j >=0 ; j--) {
                if(a[i]==a[j]){
                    count++;
                }
                if(count==2){
                    break;
                }
            }
            if(count==1){
                l++;
            }
        }
        System.out.println("数组aSort中不重复的数字个数："+l);
        //遍历数组，将aSort去重后存进aSortUnique，并输出
        int[] aSortUnique=new int[l];
        int index=0;
        for (int i = 0; i < aSort.length; i++) {
            int count=1;
            for (int j = i-1; j >=0; j--) {
                if(aSort[i]==aSort[j]){
                    count++;
                }
                if(count==2){
                    break;
                }
            }
            if(count==1){
                aSortUnique[index]=aSort[i];
                index++;
            }
        }
        System.out.println("数组aSort去重后的数组aSortUnique为：");
        for (int as : aSortUnique) {
            System.out.print(as+"\t");
        }
        System.out.println();
        //从键盘获取n
        System.out.print("请输入一个小于等于 "+l+" 的正整数n：");
        int n = sc.nextInt();
        //输出第n大的数
        System.out.println("数组a中第n大的数为："+aSortUnique[n-1]);
        //遍历数组，找第n大的数的个数
        int nCount=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==aSortUnique[n-1]){
                nCount++;
            }
        }
        System.out.println("第n大的数的个数为："+nCount);
        //动态初始化一个长度为a.length-nCount的数组，并把除第n大的数外的数字赋给它
        int[] aOut=new int[a.length-nCount];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=aSort[n-1]){
                aOut[j]=a[i];
                j++;
            }
        }
        System.out.println("去掉数组a中第 n 大的数后的数组out为：");
        for (int out : aOut) {
            System.out.print(out+"\t");
        }
    }
}
