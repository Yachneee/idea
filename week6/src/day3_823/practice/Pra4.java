package day3_823.practice;

import java.util.Scanner;

public class Pra4 {
    /**
     * 将一个字符串逆序输出 例如: abcd --> dcba
     * @param str 字符串
     * @return str逆序后的字符串
     */
    public static String convertStr(String str){
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str=sc.nextLine();
//        String str="abcd";
        String newStr=convertStr(str);
        System.out.printf("%s 逆序后是 %s",str,newStr);
    }
}
