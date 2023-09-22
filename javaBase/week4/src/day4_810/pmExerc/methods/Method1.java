package day4_810.pmExerc.methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 * 练习一些方法
 */
public class Method1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int n1 = sc.nextInt();
//        第一种，返回二维数组
        int[][] triangle=pascalTriangle(n1);
        for (int[] r : triangle) {
            System.out.println(Arrays.toString(r));
        }
//        第二种，调用方法直接输出
        System.out.print("请再次输入一个数字：");
        int n2 = sc.nextInt();
        pascalTriangle1(n2);

    }
    /**杨辉三角，生明方法：生成一个给定行数的杨辉三角*/
    public static int[][] pascalTriangle(int n){
        int[][] tr=new int[n][];
        for (int i = 0; i < tr.length; i++) {
            tr[i]=new int[i+1];
            for (int j = 0; j < tr[i].length; j++) {
                if(j==0||j==tr[i].length-1){
                    tr[i][j]=1;
                }else{
                    tr[i][j]=tr[i-1][j]+tr[i-1][j-1];
                }
            }
        }
        return tr;
    }
    /**杨辉三角，生明方法：调用方法生成一个给定行数的杨辉三角后输出*/
    public static void pascalTriangle1(int n){
        int[][] tr=pascalTriangle(n);
        for (int[] ints : tr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
