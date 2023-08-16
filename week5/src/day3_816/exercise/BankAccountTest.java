package day3_816.exercise;

public class BankAccountTest {
    //该类包含以下属性和方法：
    // 属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额（balance）
    // 方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余额的方法、存款方法、取款方法
    public static void main(String[] args) {
        BankAccount fj=new BankAccount("88888888","Jorfolge");
        fj.setBalanceDeposit(90000);
        fj.setBalanceWithdraw(100.1);
        System.out.println("账户fj的持有人姓名是："+fj.getAccountHolder()+"，账户号码为："+fj.getAccountNumber()+"，账户余额为："+fj.getBalance());
    }

}
