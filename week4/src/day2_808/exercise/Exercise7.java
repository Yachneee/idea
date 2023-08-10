package day2_808.exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //给定两个各不包含重复元素的数组 arr 和 arr1 ，求 arr 和 arr1 的交集(在 arr 中有，arr1 中也包含的元素集合)，
        // 将交集中的元素放到一个数组中并输出。
        int[] arr= {1, 2, 3};
        int[] arr1= {2, 3};
        int len=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr1.length; j++) {
                if(arr[i]==arr1[j]){
                    count++;
                }
            }
            if(count>0){
                len++;
            }
        }
        System.out.println("arr与arr1相同的元素个数："+len);
        int[] same=new int[len];
        int sIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            int current=arr[i];
            for (int j = 0; j < arr1.length; j++) {
                if(current==arr1[j]){
                    count++;
                }
            }
            if(count>0){
                sIndex++;
                same[sIndex]=arr[i];
            }
        }
        System.out.println("数组arr与数组arr1的交集："+Arrays.toString(same));
    }
}
