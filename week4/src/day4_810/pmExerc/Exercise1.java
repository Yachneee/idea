package day4_810.pmExerc;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Administrator
 */
public class Exercise1 {
    public static void main(String[] args) {
//        定义一个5*5的二维数组并初始化，找出最大值的坐标
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
                if(arr[i][j]>arr[a][b]){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("最大值的坐标为："+a+" "+b);
    }
}
