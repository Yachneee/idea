package day3_816.exercise;

public class BankAccount {
    //该类包含以下属性和方法：
    // 属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额（balance）
    // 方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余额的方法、存款方法、取款方法
    private String accountNumber;
    private String accountHolder;
    private double balance;
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
    public void setBalanceDeposit(double balance){
        this.balance+=balance;
    }
    public void setBalanceWithdraw(double balance){
        this.balance-=balance;
    }
}
