package day01;
import java.util.Scanner;
public class SumPlace {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // 从键盘上输入一个四位整数，求各位数之和。
        System.out.println("请输入一个四位整数：");
        int num=input.nextInt();
        int thou=num/1000;
        int hun=num/100%10;
        int ten=num/10%10;
        int one=num%10;
        int sum=thou+hun+ten+one;
        System.out.println("整数"+num+"的四位数之和为："+sum);
        input.close();
    }
}
