package day1_828;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个计算公式：");
        String str=sc.nextLine();
        System.out.printf("%s=%d",str,cal(str));
        //1+2*3-4/2=5
    }
    public static int cal(String str){
        while(str.contains("*")||str.contains("/")){
            int index=str.indexOf("*");
            int index1=str.indexOf("/");
            if(index==-1){
                index=index1;
            }else if(index1!=-1 && index1<index){
                index=index1;
            }
            int left=index-1;
            int right=index+1;
            while(left>=0 && Character.isDigit(str.charAt(left))){
                left--;
            }
            while(right<str.length() && Character.isDigit(str.charAt(right))){
                right++;
            }
            int i1=Integer.parseInt(str.substring(left+1,index));
            int i2=Integer.parseInt(str.substring(index+1,right));
            int c;
            if(str.charAt(index)=='*'){
                c=i1*i2;
            }else{
                c=i1/i2;
            }
            str=str.substring(0,left+1)+c+str.substring(right);
        }
        while(str.contains("+")||(str.contains("-"))){
            int index=str.indexOf("+");
            int index1=str.indexOf("-",1);
            if(index==-1){
                index=index1;
            }else if(index1!=-1&&index1<index){
                index=index1;
            }
            if(index==-1){
                break;
            }
            int left=index-1;
            int right=index+1;
            while(left>=0 && (Character.isDigit(str.charAt(left))||str.charAt(left)=='-')){
                left--;
            }
            while(right<str.length() && Character.isDigit(str.charAt(right))){
                right++;
            }
            int i1=Integer.parseInt(str.substring(left+1,index));
            int i2=Integer.parseInt(str.substring(index+1,right));
            int c;
            if(str.charAt(index)=='+'){
                c=i1+i2;
            }else{
                c=i1-i2;
            }
            str=str.substring(0,left+1)+c+str.substring(right);
        }
        return Integer.parseInt(str);
    }
}
