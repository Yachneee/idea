package day5_818.pm.exer5;

public class CheckingAccount extends BankAccount{
    private double overdraftFee;

    public CheckingAccount(String number) {
        super(number);
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
    public void withdraw(double money){
        if(money<=(this.getBalance()+100) && money>0){
            this.setBalance(this.getBalance()-money);
            System.out.println("取款成功，目前账户余额："+this.getBalance());
        }else{
            System.out.println("余额严重透支，取款失败");
        }
    }
}
