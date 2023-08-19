package day5_818.pm.exer5;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String number) {
        super(number);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void withdraw(double money){
        if(money<=(this.getBalance()-100) && money>0){
            this.setBalance(this.getBalance()-money);
            System.out.println("取款成功，目前账户余额："+this.getBalance());
        }else{
            System.out.println("余额不足，取款失败");
        }
    }
}
