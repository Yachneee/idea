package day4_810.exercise;

import java.util.Scanner;

public class Exercise2Ratio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入项数：");
        int n=sc.nextInt();
        System.out.println("相应的Π的近似结果为："+ratioLeibniz(n));
    }
    public static double ratioLeibniz(int n){
        double sum=0;
        for(int i=1;i<=n;i++){
            double a=1.0/(2.0*i-1.0);
            if(i%2==0){
                a=-a;
            }
            sum+=a;
        }
        return sum*4;
    }
}
