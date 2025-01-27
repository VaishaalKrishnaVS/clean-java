package methods.responsibility;

import java.math.BigDecimal;

public class GoodCustomerAccount {
    private final String id;
    private BigDecimal balance;
    public GoodCustomerAccount(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if(amount.compareTo(balance) > 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance = balance.subtract(amount);
    }
    public BigDecimal getBalance() {
        return balance;
    }
}
