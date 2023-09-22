package day3_802.exercise;

import java.util.Scanner;

public class TemUnits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        编写一个程序，根据用户输入的温度单位("C"表示摄氏度，"F"表示华氏度)和温度，将其转换为另一种单位后输出。
//        注: 摄氏度转换为华氏度的公式(摄氏度 * 9 / 5)+32，以及华氏度转换为摄氏度的公式(华氏度-32) * 5 / 9
        System.out.println("请输入温度：");
        double t = sc.nextDouble();
        System.out.println("请输入温度单位(C表示摄氏度，F表示华氏度)：");
        String unit = sc.next();
        double w=0;
        switch (unit) {
            case "C": {
                w = (t * 9 / 5) + 32;
                System.out.println("摄氏温度" + t + unit + "转换成华氏温度为：" + w + "F");
                break;
            }
            case "F": {
                w = (t - 32) * 5 / 9;
                System.out.println("华氏温度" + t + unit + "转换成摄氏温度为：" + w + "C");
                break;
            }
            default:
                System.out.println("您输入的单位不符合要求！！！");
        }
        sc.close();
    }
}
