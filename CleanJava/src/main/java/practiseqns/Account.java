package practiseqns;

import java.math.BigDecimal;

public class Account {
    static BigDecimal balance;
    public Account() {
        balance = new BigDecimal(0);
    }

    public static void deposit(BigDecimal amount) {
        Account.balance = balance.add(amount);
    }
    public static void withdraw(BigDecimal amount) {
        Account.balance = balance.subtract(amount);
    }
    public static String getBalance() {
        return balance.toString();
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(BigDecimal.valueOf(10));
        a.withdraw(BigDecimal.valueOf(5));
        System.out.println(a.getBalance());
    }
}
