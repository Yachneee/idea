package day1_828.abstra;

/**
 * @author Administrator
 */
public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

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
    abstract void withdraw(double money);
    abstract void deposit(double money);
}
class SavingAccount extends BankAccount{

    SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double money) {
        if(money<=getBalance()){
            super.setBalance(super.getBalance()-money);
            System.out.printf("取款%.2f成功，余额%.2f\n",money,super.getBalance());
        }else{
            System.out.println("余额不足！");
        }
    }

    @Override
    void deposit(double money) {
        setBalance(getBalance()+money);
        System.out.println("存款成功！"+money);
    }
}
class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    CheckingAccount(String accountNumber, double balance,double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    void withdraw(double money) {
        double balance=super.getBalance()-money;
        if(money<=getBalance()+overdraftLimit){
            setBalance(balance<0?0:balance);
            if(balance<0){
                overdraftLimit+=balance;
            }
            System.out.printf("取款%.2f成功，余额%.2f，透支额度%.2f\n",money,super.getBalance(),overdraftLimit);
        }else{
            System.out.println("透支额度不足！");
        }
    }

    @Override
    void deposit(double money) {
        super.setBalance(super.getBalance()+money);
        System.out.println("存款成功！"+money);
    }
}
class Test2{
    public static void main(String[] args) {
        BankAccount bk=new SavingAccount("12345",5000);
        BankAccount bk1=new CheckingAccount("11111",10000,4000);
        bk.deposit(1000);
        bk.withdraw(5100);
        bk.withdraw(1000);
        bk1.deposit(10000);
        bk1.withdraw(15000);
        bk1.withdraw(8000);
        bk1.withdraw(1100);
    }
}
