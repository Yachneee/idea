package day1_828.review;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class LongestSon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str=sc.nextLine();
        String result=longestSon(str);
        System.out.println("无重复字符的最长子串长度为："+result.length());
        System.out.println("无重复字符的最长子串之一为："+result);
        //abcabcbb ->3  abc,bca,cab,abc
        //bbbbbb   ->1  b
        //pwwkew   ->3  wke,kew
        //abefge   ->5  abefge
        //abcabcd  ->4  abcd
        //abaca    ->3  bac
        //abbbbc   ->2  ab,bc
    }
    public static String longestSon(String str){
        str=str.replace(" ","");
        String result="";
        String[] strSons=new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strSons[i]= String.valueOf(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                String c=String.valueOf(str.charAt(j));
                if(strSons[i].contains(c)){
                    break;
                }else{
                    strSons[i]+=c;
                }
            }
            result=result.length()>=strSons[i].length()?result:strSons[i];
        }
        System.out.println("所有无重复字符的子串为："+ Arrays.toString(strSons));
        return result;
    }
}
