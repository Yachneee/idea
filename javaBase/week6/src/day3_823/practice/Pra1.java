package day3_823.practice;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Pra1 {
    private static final String NAME="kfm";
    private static final String PASS="123456";
    /**
     *
      使用字符串的功能完成登录案例。案例需求如下：
      系统默认的登录名和密码是kfm/123456，
      请在控制台开发一个登录界面，接受用户输入的登录名和密码，判断用户是否登录成功，
      登录成功后展示：“欢迎进入系统！”，即可停止程序。（最多三次登录机会）
     */
    public static boolean login(String name,String password){
        return (name!=null)&&name.equals(NAME) && (password!=null)&&password.equals(PASS);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=3;
        for(int i=0;i<count;i++){
            System.out.print("请输入登录名：");
            String name=sc.next();
            System.out.print("请输入密码：");
            String password=sc.next();
            if(login(name,password)){
                System.out.println("欢迎进入系统！");
                break;
            }else{
                System.out.printf("你还有 %d 次机会。\n",count-i-1);
            }
            if(i==2){
                System.out.println("账户暂时被锁定！");
            }
        }
    }
}
