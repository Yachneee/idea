package day4_810.pmExerc;

import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
//        定义一个5*5的二维数组并初始化，找出最小值的坐标，计算出该坐标周边所有元素之和
        Random ran=new Random();
        int[][] arr=new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=ran.nextInt(21);
            }
        }
        for (int[] r : arr) {
            System.out.println(Arrays.toString(r));
        }
        int a=0;
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<arr[a][b]){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("最小值的坐标为："+a+" "+b);
        int sum1=0;
        for (int i = a-1; i <= a+1; i++) {
            for (int j =b-1; j <= b+1; j++) {
                if(!(i<0 || j<0 || i> arr.length-1 || j>arr[i].length-1 || (i==a&&j==b))) {
                    sum1+= arr[i][j];
                }
            }
        }
        int sum2=0;
        if(a-1>=0){
            sum2+=arr[a-1][b];
        }
        if(b-1>=0){
            sum2+=arr[a][b-1];
        }
        if(b+1<arr[a].length){
            sum2+=arr[a][b+1];
        }
        if(a+1<arr.length){
            sum2+=arr[a+1][b];
        }
        System.out.println("其对应数值为："+arr[a][b]+"，周边所有元素之和为："+sum1);
        System.out.println("其对应数值为："+arr[a][b]+"，上下左右所有元素之和为："+sum2);
    }
}
