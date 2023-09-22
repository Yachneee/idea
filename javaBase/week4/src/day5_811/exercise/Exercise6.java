package day5_811.exercise;

import java.util.Arrays;

public class Exercise6 {
    /*
    交换元素位置
    编写一个方法，接受一个整数数组和两个索引作为参数，交换数组中指定索引位置的两个元素。
     */
    public static void exchange(int[] arr,int index1,int index2){
        arr[index1]=arr[index1]^arr[index2];
        arr[index2]=arr[index1]^arr[index2];
        arr[index1]=arr[index1]^arr[index2];
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,3,5,0,8,7,3,6,5};
        System.out.println(Arrays.toString(a));
        exchange(a,3,5);
        System.out.println(Arrays.toString(a));
    }
}
