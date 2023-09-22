package day5_818.pm.exer5;

public class BankAccount {
    private  String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public BankAccount(String number){
        this.accountNumber=number;
    }
    public void deposit(double money){
        if(money>0){
            balance+=money;
            System.out.println("存款成功，目前账户余额："+balance);
        }else{
            System.out.println("存款失败");
        }
    }
    public void withdraw(double money){
        if(money<=balance && money>0){
            balance-=money;
            System.out.println("取款成功，目前账户余额："+balance);
        }else{
            System.out.println("取款失败");
        }
    }
}
