package day5_818.pm.exer5;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("11111111");
        System.out.println("账户号码为："+account.getAccountNumber());
        account.deposit(10000);
        account.withdraw(1000);
        account.withdraw(9000);
        account.withdraw(1);
        account.withdraw(100);
        BankAccount account1=new SavingAccount("88888888");
        System.out.println("账户号码为："+account1.getAccountNumber());
        account1.deposit(10000);
        account1.withdraw(1000);
        account1.withdraw(9000);
        account1.withdraw(8900);
        account1.withdraw(1);
        BankAccount account2=new CheckingAccount("99999999");
        System.out.println("账户号码为："+account2.getAccountNumber());
        account2.deposit(10000);
        account2.withdraw(1000);
        account2.withdraw(9000);
        account2.withdraw(1);
        account2.withdraw(99);
        account2.withdraw(1);
    }
}
