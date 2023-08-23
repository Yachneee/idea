package day3_823.practice;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Pra3 {
    /**
     * 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如：“abcba”、"上海自来水来自海上"均为对称字符串。
     * @param str 要判断的字符串
     * @return 若是对称的返回true，否则返回false
     */
    public static boolean symmetryStr(String str){
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if(chars[i]!=chars[chars.length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str=sc.nextLine();
        String judge=symmetryStr(str)? "是":"不是";
        System.out.printf("%s %s对称的字符串",str,judge);
    }
}
