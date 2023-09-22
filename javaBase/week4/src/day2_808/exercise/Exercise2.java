package day2_808.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //给定一个整数数组，输入一个值 n ，输出 n 在数组中的下标(如果不存在输出 -1 )
//        Random r=new Random();
        Scanner sc=new Scanner(System.in);
//        动态初始化一个长为10的数组，并随机生成元素，后输出
        //定义一个数组
        int[] num=new int[]{23,45,68,13,33,45,15,37,62};
//        System.out.println("整数数组num为：");
//        for (int i = 0; i < num.length; i++) {
//            num[i]=r.nextInt(21);
//            System.out.print(num[i]+"\t");
//        }
//        System.out.println();

        //从键盘获取数字n
        System.out.print("请输入一个值n：");
        int n = sc.nextInt();
        //定义一个存储下标的整型变量index,初始值为-1（确保num中不存在n时，输出-1）
        int index=-1;
        //遍历数组，判断是否在num中有n，并把下标赋给index
        for (int i = 0; i < num.length; i++) {
            if(n==num[i]){
                index=i;
            }
        }
        System.out.println("你输入的 "+n+" 在数组num中的的下标为："+index);
        sc.close();
    }
}
