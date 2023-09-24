package day2_919.am;

import lombok.SneakyThrows;

/**
 * @author Administrator
 */
public class Account {
    private int balance=100000;
    public void withdraw(int amount){
        balance=balance-amount;
    }

    public int getBalance() {
        return balance;
    }
}
class AccountRunnable implements Runnable{
    private Account account=new Account();
    @Override
    public void run() {
        withdraw(100000);
    }
    @SneakyThrows
    private void withdraw(int money){
        if (account.getBalance() >= money) {
            System.out.println(Thread.currentThread().getName()+"准备取款");
            Thread.sleep(1000);
            account.withdraw(money);
            System.out.println(Thread.currentThread().getName()+"取款成功，余额为："+account.getBalance());
        } else {
            System.out.println("余额不足,"+Thread.currentThread().getName()+"取款，余额为："+account.getBalance());
        }
    }
}
class AccountTest{
    public static void main(String[] args) {
        AccountRunnable run = new AccountRunnable();
        Thread t1=new Thread(run,"张三");
        Thread t2=new Thread(run,"李四");
        t1.start();
        t2.start();
    }
}