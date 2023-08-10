package day4_810.exercise;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3Log {
    public static void main(String[] args) {
        logConfirm();
    }

    public static void logConfirm(){
        Scanner sc=new Scanner(System.in);
        int n=3;
        for(int i=0;i<n;i++){
            System.out.print("请输入用户名：");
            String name=sc.next();
            System.out.print("请输入密码：");
            String password=sc.next();
            if(Objects.equals(name, "开发喵") && Objects.equals(password, "kaifamiao")){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("你还有 "+(n-1-i)+" 次机会");
            }
        }
    }
}
