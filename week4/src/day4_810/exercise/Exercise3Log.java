package day4_810.exercise;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Exercise3Log {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 定义允许的输入次数 */
        int n = 3;
        /* 循环，调用验证方法 */
        while(true){
            System.out.print("请输入用户名：");
            String name = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();
            if (logConfirm(name, password)) {
                System.out.println("登陆成功！");
                break;
            }else {
                n--;
                if(n==0){
                    System.out.println("账号已被锁定！");
                    break;
                }else{
                System.out.println("你还有 " + n + " 次机会！");
                }
            }
        }
    }

    public static boolean logConfirm(String name,String password){
        return "开发喵".equals(name) && "kaifamiao".equals(password);
    }
}
