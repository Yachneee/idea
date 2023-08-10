package day4_810.exercise;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Exercise1Methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //练习1
        System.out.print("请输入一个整数：");
        int n1=sc.nextInt();
        System.out.println(n1+"是偶数且能被3整除吗？"+isEvenAndDivisibleByThree(n1));
        //练习2
        System.out.print("请输入一个浮点数：");
        double n2=sc.nextDouble();
        System.out.println(n2+"是正数且大于10? "+isPositiveAndGreaterThanTen(n2));
        //练习3
        System.out.println(n1+"在[0,100]内吗? "+isInValidRange(n1));
        //练习4
        boolean bool1=n1 < n2;
        boolean bool2=n1+1 > n2;
        System.out.println("两个条件都满足吗? "+isBothConditionsTrue(bool1,bool2));
        //练习5
        System.out.print("请输入一个四位数字：");
        int num=sc.nextInt();
        isPalindromeNumber(num);
        //练习6
        System.out.println("请输入第1个数字：");
        double num1=sc.nextDouble();
        System.out.println("请输入第2个数字：");
        double num2=sc.nextDouble();
        System.out.println("请输入操作符：");
        String ins= sc.next();
        calculate(num1,num2,ins);
    }

    /** 编写一个方法 isEvenAndDivisibleByThree(int number)，该方法接收一个整数参数 number，判断该数是否既是偶数又能被3整除。
    如果是，则返回 true，否则返回 false。*/
    public static boolean isEvenAndDivisibleByThree(int number){
        return number%2==0 && number%3==0;
    }

    /** 编写一个方法 isPositiveAndGreaterThanTen(double number)，该方法接收一个双精度浮点数参数 number，
     * 判断该数是否是正数且大于 10。如果满足条件，则返回 true，否则返回 false。*/
    public static boolean isPositiveAndGreaterThanTen(double number){
        return number > 10 && number >0 ;
    }

    /**编写一个方法 isInValidRange(int number)，该方法接收一个整数参数number，
     判断该数是否在有效范围内。有效范围定义为大于等于 0 且小于等于 100。
     如果在有效范围内，则返回 true，否则返回 false。*/
    public static boolean isInValidRange(int number){
        return number>=0 && number<=100;
    }

    /** 编写一个方法 isBothConditionsTrue(boolean condition1，boolean condition2)，
     * 该方法接收两个布尔类型的参数 condition1 和 condition2，判断这两个条件是否都为 true。
     * 如果两个条件都为 true，则返回 true，否则返回false */
    public static boolean isBothConditionsTrue(boolean condition1,boolean condition2){
        return condition1 && condition2;
    }

    /** 编写一个方法 isPalindromeNumber(int number)，该方法接收一个四位整数参
    *数 number，判断该数是否是回文数。回文数是指正序和倒序读都相同的整数。
    *如果是回文数，则返回 true，否则返回false。*/
    public static void isPalindromeNumber(int number){
        int a=number/1000;
        int b=number/100%10;
        int c=number/10%10;
        int d=number%10;
        if(number>999 && number<10000){
            System.out.println("你输入的数字是回文数字吗？"+(a==d&&b==c));
        }else{
            System.out.println("你输入的数字不符合要求！");
        }
    }

    /** 编写一个Java程序，实现一个简单的计算器。
    *用户输入两个数字和一个操作符(如加法、减法、乘法或除法)，程序根据操作符进行相应的计算并输出结果。*/
    public static void calculate(double num1,double num2,String instruct) {
        switch (instruct){
            case "+" :
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "-" :
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case "*" :
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case "/" :
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            case "%" :
                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
                break;
            default :
                System.out.println("你输入的操作符不合法");
                break;
        }
    }
}
