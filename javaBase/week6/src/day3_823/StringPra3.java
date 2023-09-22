package day3_823;

import java.util.Scanner;

public class StringPra3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.next();
        count(str);

    }
    public static void count(String str){
        char[] c=str.toCharArray();
        int countLetter=0;
        int countNum=0;
        for (char ch : c) {
            if(ch >='a' && ch<='z'|| ch>='A'&&ch<='Z'){
                countLetter++;
            } else if (ch>='0'&&ch<='9') {
                countNum++;
            }
        }
        System.out.printf(str+"中有%d个字母，有%d个数字",countLetter,countNum);
    }
}
