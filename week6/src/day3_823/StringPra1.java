package day3_823;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class StringPra1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("请输入email：");
            String email = sc.next();
            if(!judgeEmail(email)){
                System.out.println("你输入的email不合法!请重新输入！");
            }else{
                System.out.println("输入合理！");
                break;
            }
        }
    }
    public static boolean judgeEmail(String email){
        int c1=email.indexOf('@');
        int c2=email.indexOf('.');
        int o=email.lastIndexOf('@');
        boolean s=email.startsWith("@");
        boolean e=email.endsWith(".");
        return c1>=0 && c2>=0 && c1<c2 && c1==o && !s && !e;
    }
}
