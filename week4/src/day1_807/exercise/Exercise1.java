package day1_807.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //1.定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
        //操作步骤：
        //1.定义5个元素数组
        //2.可以使用初始化数组的两种方式之一为数组元素赋值
        //3.遍历数组求数组中的最小值
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[5];
        System.out.println("请为数组赋5个值：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int minIndex=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("最小值为："+min+"，其下标为："+minIndex);
        sc.close();
    }
}
