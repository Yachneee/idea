package pract;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //编写一个程序，根据员工的工龄来计算年终奖金。奖金计算规则如下：
        //工龄小于等于5年，奖金为工资的5%
        //工龄大于5年且小于等于10年，奖金为工资的10%
        //工龄大于10年，奖金为工资的15%
        System.out.println("请输入员工工龄：");
        int empl = sc.nextInt();
        System.out.println("请输入员工工资：");
        int salary = sc.nextInt();
        double b;
        if (empl<=5){
            b=salary*0.05;
        } else if (empl<=10) {
            b=salary*0.1;
        } else {
            b=salary*0.15;
        }
        System.out.println("该员工奖金为"+b+"元。");
        sc.close();
    }
}
