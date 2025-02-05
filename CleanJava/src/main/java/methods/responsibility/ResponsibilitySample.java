package methods.responsibility;

import java.math.BigDecimal;
import java.util.UUID;

/// One Method should be responsible for one thing
/// A method should usually follow CQS and be of two kinds:
///     a void method that changes the state of an object, or
///     a non-void method that performs a computation and returns the result
/// Methods should not have undocumented side effects

public class ResponsibilitySample {
    public static void main(String[] args) {
        System.out.println("Bad Practice");
        showBadPractice();
        System.out.println("Good Practice");
        showGoodPractice();
    }
    private static void showBadPractice() {
        BadCustomerAccount account = new BadCustomerAccount(UUID.randomUUID().toString(), BigDecimal.valueOf(100.0));
        account.processTransaction("deposit", BigDecimal.valueOf(10));
        account.processTransaction("withdraw", BigDecimal.valueOf(15));
    }
    private static void showGoodPractice() {
        GoodCustomerAccount account = new GoodCustomerAccount(UUID.randomUUID().toString(), BigDecimal.valueOf(100.0));
        account.deposit(BigDecimal.valueOf(10));
        account.withdraw(BigDecimal.valueOf(15));
        System.out.println(account.getBalance().toString());
    }
}
