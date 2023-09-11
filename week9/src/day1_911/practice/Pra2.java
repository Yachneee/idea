package day1_911.practice;

import java.util.*;

/**
 * @author Administrator
 */
public class Pra2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,-2,4};
        System.out.println("所有元素之和："+sum(arr));
        System.out.println("最大值："+max(arr));
        System.out.println("最小值："+min(arr));
        Set<Integer> set=Set.of(1,2,3,-1,-2,4);
        System.out.println(sum(set));
    }
    public static int sum(int[] arr){
        return Arrays.stream(arr).reduce(0,(i1,i2)->i1+i2);
    }
    public static int sum(Collection<Integer> collection){
        return collection.stream().reduce(0,(i1,i2)->i1+i2);
    }
    public static int max(int[] arr){
        return Arrays.stream(arr).reduce(arr[0],(i1,i2)->Math.max(i1,i2));
    }
    public static int min(int[] arr){
        return Arrays.stream(arr).reduce(arr[0],(i1,i2)->Math.min(i1,i2));
    }
}
