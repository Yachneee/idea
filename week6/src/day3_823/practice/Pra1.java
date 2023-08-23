package day3_823.practice;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Pra1 {
    /**
     *
      使用字符串的功能完成登录案例。案例需求如下：
      系统默认的登录名和密码是kfm/123456，
      请在控制台开发一个登录界面，接受用户输入的登录名和密码，判断用户是否登录成功，
      登录成功后展示：“欢迎进入系统！”，即可停止程序。（最多三次登录机会）
     */
    public static boolean login(String name,String password){
        return "kfm".equals(name)&& "123456".equals(password);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("请输入登录名：");
            String name=sc.next();
            System.out.print("请输入密码：");
            String password=sc.next();
            if(login(name,password)){
                System.out.println("欢迎进入系统！");
                break;
            }else{
                System.out.println("你输入的登录名或密码有误，请重新输入！");
            }
            if(i==2){
                System.out.println("账户暂时被锁定！");
            }
        }
    }
}
