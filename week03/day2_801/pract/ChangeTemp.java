package pract;
import java.util.Scanner;
public class ChangeTemp {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        // 定义两个整变量，交换两个变量的值。 方法1：通过位运算(异或运算) 方法2：定义临时(中间)变量
        // 方法2
        System.out.print("请分别输入2个整数：");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("交换前，a的值为："+a+"，b的值为："+b);
        int temp=0;
        temp = a;
        a=b;
        b=temp;
        System.out.println("交换后，a的值为："+a+"，b的值为："+b);
        in.close();
    }
}
