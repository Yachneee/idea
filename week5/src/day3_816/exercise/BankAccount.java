package day3_816.exercise;

import java.util.Arrays;

public class BankAccount {
    //该类包含以下属性和方法：
    // 属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额（balance）
    // 方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余额的方法、存款方法、取款方法
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(){
    }
    public BankAccount(String accountNumber,String accountHolder){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public boolean deposit(double money){
        if(money>0){
            this.balance+=money;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean withdraw(double money){
        if(money>this.balance){
            return false;
        }
        else{
            this.balance+=money;
            return true;
        }
    }
    public String showInfo(){
        return "账户号码："+getAccountNumber()+"，账户持有人姓名："+getAccountHolder()+"，账户余额："+getBalance();
    }
}
