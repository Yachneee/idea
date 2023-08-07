import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        5! = 5 * 4 * 3 * 2 * 1 输入一个数，计算阶乘
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int n = sc.nextInt();
        System.out.print(n+" 的阶乘为："+n+"! = ");
        int mult=1;
        for(int i=n;i>1;i--){
            System.out.print(i+" * ");
            mult*=i;
        }
        System.out.print("1 = "+mult);
    }
}
