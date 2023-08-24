package day4_824;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个计算公式：");
        String str=sc.nextLine();
        cal(str);
        //1+2*3-4/2
        // =5
    }
    public static void cal(String str){
        String str1=mul(str);
        String str2=dvi(str1);
        String str3=add(str2);
        String str4=reduce(str3);
        System.out.printf("%s = %s = %s = %s = %s \n",str,str1,str2,str3,str4);
        System.out.printf("%s = %s",str,str4);
    }
    public static String mul(String str){
        int i;
        while(str.contains("*")){
            i=str.indexOf("*");
            char c1=str.charAt(i-1);
            char c2=str.charAt(i+1);
            int i1=Integer.parseInt(String.valueOf(c1));
            int i2=Integer.parseInt(String.valueOf(c2));
            String s=String.valueOf(i1*i2);
            str=str.replace(c1+"*"+c2,s);
        }
        return str;
    }
    public static String dvi(String str){
        int i;
        while(str.contains("/")){
            i=str.indexOf("/");
            char c1=str.charAt(i-1);
            char c2=str.charAt(i+1);
            int i1=Integer.parseInt(String.valueOf(c1));
            int i2=Integer.parseInt(String.valueOf(c2));
            String s=String.valueOf(i1/i2);
            str=str.replace(c1+"/"+c2,s);
        }
        return str;
    }
    public static String add(String str){
        int i;
        while(str.contains("+")){
            i=str.indexOf("+");
            char c1=str.charAt(i-1);
            char c2=str.charAt(i+1);
            int i1=Integer.parseInt(String.valueOf(c1));
            int i2=Integer.parseInt(String.valueOf(c2));
            String s=String.valueOf(i1+i2);
            str=str.replace(c1 +"+"+c2,s);
        }
        return str;
    }
    public static String reduce(String str){
        int i;
        while(str.contains("-")){
            i=str.indexOf("-");
            char c1=str.charAt(i-1);
            char c2=str.charAt(i+1);
            int i1=Integer.parseInt(String.valueOf(c1));
            int i2=Integer.parseInt(String.valueOf(c2));
            String s=String.valueOf(i1-i2);
            str=str.replace(c1+"-"+c2,s);
        }
        return str;
    }
}
