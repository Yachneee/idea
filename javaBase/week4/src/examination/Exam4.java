package examination;

import java.util.Arrays;
import java.util.Scanner;

public class Exam4 {
    public static void yh(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                if(j==0 || j==arr[i].length-1){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入行数：");
        int row=sc.nextInt();
        int[][] yhTriangle=new int[row][];
        yh(yhTriangle);
        for (int[] r : yhTriangle) {
            System.out.println(Arrays.toString(r));
        }
    }
}
