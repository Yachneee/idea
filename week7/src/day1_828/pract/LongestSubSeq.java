package day1_828.pract;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class LongestSubSeq {
    //给定两个字符串，编写一个函数来获取这两个字符串的最长公共子序列。

    public static String longestSubSeq(String str1,String str2){
        String result="";
        String[] strs=new String[str1.length()];
        int start=0;
        for (int k = 0; k < str1.length(); k++) {
            int i = k;
            int temp=0;
            strs[start]="";
            while(i < str1.length()){
                int j=temp;
                while(j < str2.length()){
                    if(str1.charAt(i)==str2.charAt(j)){
                        strs[start]+=str1.charAt(i);
                        i++;
                        j++;
                        temp=j;
                    }else{
                        j++;
                    }
                }
                i++;
            }
            if(strs[start].length()>result.length()){
                result=strs[start];
            }
            start++;
        }
        System.out.println(Arrays.toString(strs));
        return result;
//        if(str2.contains(strs[i])&&strs[i].length()>result.length()){
//            result=strs[i];
//        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请分别输入两个字符串：");
        String str1= sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("\""+longestSubSeq(str1,str2)+"\"");
        //输入 ： "abcde" "ace" 输出 ： "ace"
        //
        //输入："abc" "def" 输出：""
        //
        //输入："AGGTAB" "GXTXAYB" 输出："GTAB"
    }
}
