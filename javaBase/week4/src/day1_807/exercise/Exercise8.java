package day1_807.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）

        //直接定义
//        int[] a={2,3,5,4,8,10,0};

        //先从键盘获取数组长度，再随机生成一组
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("请输入一个数字作为数组长度：");
        int l = sc.nextInt();
        int[] a=new int[l];
        for (int i = 0; i < l; i++) {
            a[i]=r.nextInt(100)+1;
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        //定义新数组，存储变化后的数组
        int[] a_copy=new int[a.length];
        int placeLeft=0;
        int placeRight=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                a_copy[placeLeft]=a[i];
                placeLeft++;
            }else{
                a_copy[a.length-placeRight-1]=a[i];
                placeRight++;
            }
        }
        System.out.println("变化后的数组a_copy为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a_copy[i]+"\t");
        }
    }
}
