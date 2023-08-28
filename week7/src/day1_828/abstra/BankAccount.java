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
    abstract boolean withdraw(double money);
    abstract double deposit(double money);
}
class SavingAccount extends BankAccount{

    SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    boolean withdraw(double money) {
        if(money<=getBalance()){
            setBalance(getBalance()-money);
            return true;
        }
        return false;
    }

    @Override
    double deposit(double money) {
        setBalance(getBalance()+money);
        return getBalance();
    }
}
class CheckingAccount extends BankAccount{
    private final double overdraftLimit=1000;

    CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    boolean withdraw(double money) {
        if(money<=getBalance()+overdraftLimit){
            setBalance(getBalance()-money);
            return true;
        }
        return false;
    }

    @Override
    double deposit(double money) {
        setBalance(getBalance()+money);
        return getBalance();
    }
}
class Test2{
    public static void main(String[] args) {
        BankAccount bk=new SavingAccount("12345",5000);
        BankAccount bk1=new CheckingAccount("11111",10000);
        System.out.println(bk.deposit(1000));
        System.out.println(bk.withdraw(6100)?"取钱成功":"取钱失败");
    }
}
