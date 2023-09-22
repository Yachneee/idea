import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        //输入一个数字，和位数，判断这个数是否回文数字    1221 就是回文数字
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个四位数字： ");
        int num = sc.nextInt();
        if((num/1000 == num%10)&&(num/100%10 == num/10%10)){
            System.out.println(num+" 是回文数字");
        }else{
            System.out.println(num+" 不是回文数字");
        }
    }
}
