package day4_824;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class DeleteRe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();
        System.out.printf("%s去重后为%s",str,deRe(str));
    }
    public static String deRe(String str){
        String strNew="";
        for (int i = 0; i < str.length(); i++) {
            String c=String.valueOf(str.charAt(i));
            if(!strNew.contains(c)){
                strNew=strNew+c;
            }
        }
        return strNew;
    }
}
