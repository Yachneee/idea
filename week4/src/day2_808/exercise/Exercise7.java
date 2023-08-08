package day2_808.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //给定两个各不包含重复元素的数组 arr 和 arr1 ，求 arr 和 arr1 的交集(在 arr 中有，arr1 中也包含的元素集合)，
        // 将交集中的元素放到一个数组中并输出。
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int[] arr=new int[20];
        int[] arr1=new int[25];
        System.out.print("arr数组：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(30);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.print("arr1数组：");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=r.nextInt(30);
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        //遍历数组，获取arr去重后的数组长度l
        int l=1;
        for (int i = 1; i < arr.length; i++) {
            boolean same=false;
            for (int j = 0; j <arr.length && j!=i ; j++) {
                if(arr[i]==arr[j]){
                    same=true;
                    break;
                }
            }
            if(!same){
                l++;
            }
        }
        System.out.println("arr中不重复的元素个数为："+l);
        //动态初始化一个长度为l的数组，把arr中不重复的值存储进去
        int[] arrU=new int[l];
        //遍历数组，把互异的l个值存储在arr里
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            boolean unique=true;
            for (int j = 0; j <arr.length && j!=i ; j++) {
                if(arr[i]==arr[j]){
                    unique=false;
                    break;
                }
            }
            if(unique){
                arrU[index]=arr[i];
                index++;
            }
        }
        //输出去异后的arrU
        System.out.print("arr去重后得到的arrU数组：");
        for (int array : arrU) {
            System.out.print(array+"\t");
        }
        System.out.println();
        int len=0;
        for (int i = 0; i < arrU.length; i++) {
            int count=0;
            for (int j = 0; j < arr1.length; j++) {
                if(arrU[i]==arr1[j]){
                    count++;
                }
            }
            if(count>0){
                len++;
            }
        }
        System.out.println();
        System.out.println("arr与arr1相同的元素个数："+len);
        int[] same=new int[len];
        int sIndex=-1;
        for (int i = 0; i < arrU.length; i++) {
            int count=0;
            int current=arrU[i];
            for (int j = 0; j < arr1.length; j++) {
                if(current==arr1[j]){
                    count++;
                }
                if(count>0){
                    sIndex++;
                    break;
                }
            }
            if(count>0){
                same[sIndex]=arrU[i];
            }
        }
        System.out.print("数组arr与数组arr1的交集(去重)：");
        for (int s : same) {
            System.out.print(s+"\t");
        }
    }
}
