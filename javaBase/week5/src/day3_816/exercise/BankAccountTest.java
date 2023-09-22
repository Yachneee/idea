package day3_816.exercise;

import java.util.Scanner;

/**
 * @author Administrator
 */
@SuppressWarnings("AlibabaSwitchStatement")
public class BankAccountTest {
    static Scanner sc=new Scanner(System.in);
    static BankAccount b=new BankAccount();
    //该类包含以下属性和方法：
    // 属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额（balance）
    // 方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余额的方法、存款方法、取款方法
    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.print("请输入操作编号：");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> addBankAccount();
                case 2 -> showAccountInfo();
                case 3 -> saveMoney();
                case 4 -> drawMoney();
                default -> {
                    System.out.println("退出成功，再见！");
                    return;
                }
            }
        }
    }
    public static void menu(){
        System.out.println("-------------");
        System.out.println("1. 添加账户");
        System.out.println("2. 查看账户信息");
        System.out.println("3. 存钱");
        System.out.println("4. 取钱");
        System.out.println("0. 退出");
        System.out.println("-------------");
    }
    public static void addBankAccount(){
        System.out.print("请输入账户号码：");
        String num=sc.next();
        System.out.print("请输入账户持有人姓名：");
        String name=sc.next();
        b=new BankAccount(num,name);
        System.out.println("添加成功！");
    }
    public static void showAccountInfo(){
        System.out.println(b.showInfo());
    }
    public static void saveMoney(){
        System.out.print("请输入存款金额：");
        double money=sc.nextInt();
        if(b.deposit(money)){
            System.out.println("存款成功！目前账户余额："+b.getBalance());
        }else{
            System.out.println("存款失败！");
        }
    }
    public static void drawMoney(){
        System.out.print("请输入取款金额：");
        double money=sc.nextInt();
        if(b.withdraw(money)){
            System.out.println("取款成功！目前账户余额："+b.getBalance());
        }else{
            System.out.println("取款失败！");
        }
    }
}
