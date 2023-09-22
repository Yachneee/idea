package day2_829;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSub {
    public static void main(String[] args) {
//        String str1="AGGTAB";
//        String str2="GXTXAYB";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个字符串：");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int[][] subLength=subLength(str1,str2);
        for (int[] r : subLength) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println(subString(subLength,str1));
    }
    public static int[][] subLength(String str1,String str2){
        int[][] same=new int[str1.length()+1][str2.length()+1];
        for (int i = 1; i < same.length; i++) {
            for (int j = 1; j < same[i].length; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    same[i][j]=same[i-1][j-1]+1;
                } else if (str1.charAt(i-1)!=str2.charAt(j-1)) {
                    same[i][j]=Math.max(same[i][j-1],same[i-1][j]);
                }
            }
        }
        return same;
    }
    public static String subString(int[][] same,String str1){
        String result="";
        int i = same.length - 1;
        int j = same[i].length - 1;
        outer:while (true) {
            while (true) {
                if(same[i][j]>Math.max(same[i][j-1],same[i-1][j])){
                    result+=str1.charAt(i-1);
                    i--;
                    j--;
                }else{
                    while(same[i][j]==same[i][j-1]){
                        j--;
                    }
                    while (same[i][j]==same[i-1][j]) {
                        i--;
                    }
                }
                if(i==0||j==0){
                    break outer;
                }
            }
        }
        StringBuilder str= new StringBuilder(result);
        return str.reverse().toString();
    }
}
