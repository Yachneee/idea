package day01;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        // 编写一个Java程序，接收用户输入的一个三角形的三个边长，判断这三条边是否能构成一个三角形，并输出相应的结果。
        System.out.println("请分别输入3个数字作为可能的三角形边长：");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        boolean src=(a+b>c)&&(a+c>b)&&(b+c>a);
//        boolean src2=((a-b)*(a-b)<c*c)&&((a-c)*(a-c)<b*b)&&((b-c)*(b-c)<a*a);（6种两边差已被上面和包含）
//        boolean src=src1 && src2;
        System.out.println("您输入的三个数字"+a+" "+b+" "+c+"是否能构成一个三角形？"+src);
        in.close();
    }
}
