package day3_809;

import java.util.Scanner;

public class PanscleTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入行数：");
        int n=sc.nextInt();
        int[][] tr=new int[n][n];
        for (int i = 0; i < tr.length; i++) {
            for (int j = 0; j < tr[i].length; j++) {
                if(j==0||j==i){
                    tr[i][j]=1;
                }else if(i>0&&j>0){
                    tr[i][j]=tr[i-1][j]+tr[i-1][j-1];
                }
            }
        }
        for (int[] r : tr) {
            for (int c : r) {
                if(c!=0){
                    System.out.print(c+"\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
