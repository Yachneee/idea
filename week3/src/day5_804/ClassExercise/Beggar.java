package day5_804.ClassExercise;

import java.util.Scanner;

public class Beggar {
    public static void main(String[] args) {
        //洪乞丐干10天，收入是多少？
        //天朝有一个乞丐姓洪，去天桥要钱
        //第一天要了1块钱
        //第二天要了2块钱
        //第三天要了4块钱
        //第四天要了8块钱
        //以此类推
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入天数：");
        int d = sc.nextInt();
        int money=1;
//        int sum=1;
//        System.out.println("第 1 天要了 "+money+" 元，共要了 "+sum+" 元");
//        for(int i=2;i<=10;i++){
//            money=money*2;
//            sum+=money;
//            System.out.println("第 "+i+" 天要了 "+money+" 元，共要了 "+sum+" 元");
//        }
        int sum=0;
        for(int i=1;i<=d;i++){
            sum+=money;
            System.out.println("第 "+i+" 天要了 "+money+" 元，共要了 "+sum+" 元");
            money=money*2;
        }
        System.out.println("洪乞丐 "+d+" 天的收入是："+sum);
    }
}
