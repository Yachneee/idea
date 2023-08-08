package day2_808.exercise;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        //给定一个整数数组，编写一个程序，移除数组中的重复元素，输出一个去重后的数组。
        Random r=new Random();
        //动态初始化一个长度为20的数组，随机生成数值后输出
        int[] a=new int[20];
        for (int i = 0; i < a.length; i++) {
           a[i]=r.nextInt(20);
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
        //动态初始化一个长度为l的数组，把a中不重复的值存储进去
        int[] arr=new int[l];
        //遍历数组，把互异的l个值存储在arr里
        int index=0;
        for (int i = 0; i < a.length; i++) {
            boolean unique=true;
            for (int j = 0; j <a.length && j!=i ; j++) {
                if(a[i]==a[j]){
                    unique=false;
                    break;
                }
            }
            if(unique){
                arr[index]=a[i];
                index++;
            }
        }

        //输出去异后的arr
        for (int array : arr) {
            System.out.print(array+"\t");
        }
    }
}
