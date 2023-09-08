package day5_908.pm.practice;

import java.util.*;

/**
 * @author Administrator
 */
public class Pra4 {
    static class Account{
        private long id;
        private double balance;
        private String password;
        private static long size;
        Account(double balance,String password){
            this.id=++size;
            this.balance=balance;
            this.password=password;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "账号：" + id +
                    ", 余额：" + balance +
                    ", 密码：'" + password + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Account account = (Account) o;
            return id == account.id && Double.compare(balance, account.balance) == 0 && Objects.equals(password, account.password);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, balance, password);
        }
    }

    public static void main(String[] args) {
        List<Account> list=new ArrayList<>();
        list.add(new Account(10.00,"1234"));
        list.add(new Account(15.00,"5678"));
        list.add(new Account(0,"1010"));
        Map<Long,Account> map=new HashMap<>();
        list.forEach(account -> {
            long key = account.id;
            map.put(key,account);
        });
        map.forEach((key,account)-> System.out.println(key+"->"+account.balance));
    }
}
