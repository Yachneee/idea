package day3_802.exercise;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        //编写一个程序，根据用户输入的月份（1 到 12），输出该月份所属的季节。假设春季是 3 到 5 月，夏季是 6 到 8 月，秋季是 9 到 11 月，
        // 冬季是 12、1 和 2月。如果输入的月份超出了范围，输出"输入错误"。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month){
            case 3,4,5:
                System.out.println(month+"月属于春季。");
                break;
            case 6,7,8:
                System.out.println(month+"月属于夏季。");
                break;
            case 9,10,11:
                System.out.println(month+"月属于秋季。");
                break;
            case 12,1,2:
                System.out.println(month+"月属于冬季。");
                break;
            default:
                System.out.println("你输入的月份有误!!!");
                break;
        }
        sc.close();
    }
}
