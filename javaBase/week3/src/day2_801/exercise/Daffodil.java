package day2_801.exercise;
import java.util.Scanner;
public class Daffodil {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        // 从键盘上输入一个三位数，判断是否是水仙花数，是输出true，不是输出false 水仙花：各个位上的数字的立方和等于该数本身
        System.out.println("请输入一个三位数");
        int num= input.nextInt();
        int a=num/100;
        int b=num/10%10;
        int c=num%10;
        int cube=a*a*a+b*b*b+c*c*c;
        boolean src = cube == num;
        System.out.println("三位数"+num+"是否为水仙花数？"+src);
        input.close();
    }
}
