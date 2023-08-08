package day3_802.exercise;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        编写一个简单的计算器程序，要求用户输入两个数和操作符（+、-、*、/），然后根据操作符进行相应的运算，并输出结果。如果输入的运算符不是有效的
//        运算符，则输出"无效的运算符"。
        System.out.println("请输入要计算的第1个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入要计算的第2个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入操作符：");
        String s = sc.next();
        int result= 0;
        boolean a=true;
        switch(s){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "%":
                result=num1%num2;
                break;
            default:
                a=false;
                break;
        }
        if (a){
            System.out.println(num1+s+num2+"的结果为"+result);
        }else{
            System.out.println("无效的运算符");
        }
        sc.close();
    }
}