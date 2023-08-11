package day5_811.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    /*
    数组元素左移
编写一个方法，接受一个整数数组和一个正整数 k 作为参数，将数组中的元素左移 k 个位置。
     */
    public static int[] leftShift(int[] arr,int k){
        int[] a=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-k){
                a[i]=arr[i+k];
            }else{
                a[i]=arr[i-(arr.length-k)];
            }
        }
        return a;
    }

    public static int[] leftShift1(int[] arr,int k){
        int[] a=new int[arr.length];
        System.arraycopy(arr,k,a,0,arr.length-k);
        System.arraycopy(arr,0,a,k-1,k);
        return a;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入移动位数：");
        int place=sc.nextInt();
        System.out.println(Arrays.toString(leftShift(a,place)));

        System.out.println(Arrays.toString(leftShift1(a,place)));
    }
}
