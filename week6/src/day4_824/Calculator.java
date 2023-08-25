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
        System.out.printf("%s=%s",str,cal(str));
        //1+2*3-4/2
        // =5
    }
    public static String cal(String str){
        while (str.contains("*")||str.contains("/")){
            while(str.indexOf("/")<str.indexOf("*")|| !str.contains("*")){
                str=dvi(str);
                str=mul(str);
            }
            str=mul(str);
            str=dvi(str);
        }
        while(str.contains("+")||str.contains("-")){
            str=reduce(str);
            str=add(str);
        }
        return str;
    }
    public static String mul(String str){
        int index=str.indexOf("*");
        if(index!=-1){
            String str1=sLeft(str,index);
            String str2=sRight(str,index);
            String s=String.valueOf(Integer.parseInt(str1)*Integer.parseInt(str2));
            str=str.replace(str1+"*"+str2,s);
        }
        return str;
    }
    public static String dvi(String str){
        int index=str.indexOf("/");
        if(index!=-1){
            String str1=sLeft(str,index);
            String str2=sRight(str,index);
            String s=String.valueOf(Integer.parseInt(str1)/Integer.parseInt(str2));
            str=str.replace(str1+"/"+str2,s);
        }
        return str;
    }
    public static String add(String str){
        int index=str.indexOf("+");
        if(index!=-1){
            String str1=sLeft(str,index);
            String str2=sRight(str,index);
            String s=String.valueOf(Integer.parseInt(str1)+Integer.parseInt(str2));
            str=str.replace(str1+"+"+str2,s);
        }
        return str;
    }
    public static String reduce(String str){
        int index=str.indexOf("-");
        if(index!=-1){
            String str1=sLeft(str,index);
            String str2=sRight(str,index);
            String s=String.valueOf(Integer.parseInt(str1)-Integer.parseInt(str2));
            str=str.replace(str1+"-"+str2,s);
        }
        return str;
    }
    public static String sLeft(String str,int index){
        int d1LeftIndex=-1;
        for (int i = index-1; i >= 0; i--) {
            if(i==0){
                d1LeftIndex=0;
                break;
            }
            if(!(Character.isDigit(str.charAt(i)))){
                d1LeftIndex=i+1;
                break;
            }
        }
        return str.substring(d1LeftIndex,index);
    }
    public static String sRight(String str,int index){
        int d2RightIndex=-1;
        for (int i=index+1; i<str.length(); i++) {
            if(i==str.length()-1){
                d2RightIndex=str.length();
                break;
            }
            if(!(Character.isDigit(str.charAt(i)))){
                d2RightIndex=i;
                break;
            }
        }
        return str.substring(index+1,d2RightIndex);
    }
}
