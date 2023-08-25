package day5_825;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Longest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str=sc.nextLine();
        longestSon(str);
        //abcabcbb ->3  abc,bca,cab,abc
        //bbbbbb   ->1  b
        //pwwkew   ->3  wke,kew
        //abefge   ->5  abefge
        //abcabcd  ->4  abcd
        //abaca    ->3  bac
        //abbbbc   ->2  ab,bc
    }
    public static void longestSon(String str){
        int[] counts=new int[str.length()];
        String[] strSons=new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strSons[i]= String.valueOf(str.charAt(i));
            counts[i]=1;
            for (int j = i+1; j < str.length(); j++) {
                String c=String.valueOf(str.charAt(j));
                if(strSons[i].contains(c)){
                    break;
                }else{
                    strSons[i]+=c;
                    counts[i]++;
                }
            }
        }
        System.out.println("所有无重复字符的子串为："+ Arrays.toString(strSons));
        int maxIndex=max(counts);
        System.out.println("无重复字符的最长子串长度为："+counts[maxIndex]);
        System.out.println("无重复字符的最长子串之一为："+strSons[maxIndex]);
    }
    private static int max(int[] counts){
        int maxIndex=0;
        for (int i = 1; i < counts.length; i++) {
            maxIndex=counts[i]>counts[maxIndex] ? i : maxIndex;
        }
        return maxIndex;
    }
}
