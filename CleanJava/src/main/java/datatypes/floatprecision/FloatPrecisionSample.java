package datatypes.floatprecision;

import java.math.BigDecimal;

public class FloatPrecisionSample {
    public static void main(String[] args) {
        System.out.println("Show Bad Practice");
        showBadPractice();

        System.out.println("Show Good Practice:: Int usage");
        showGoodPractice();

        System.out.println("Show Bad Practice:: BigDecimal usage");
        showBadPractice1();

        System.out.println("Use Integer or BigDecimal for precise calculation of floating numbers");

    }
    public static void showBadPractice() {
        double totalBudget = 1.00;
        double itemPrice = 0.1;
        System.out.println("Initial Budget: " + totalBudget);
        System.out.println("Single Item Price: " + itemPrice);
        System.out.println("Remaining budget after purchase of 9 items: " + (totalBudget - 9 * itemPrice));

    }
    public static void showGoodPractice() {
        int totalBudget = 100;
        int itemPrice = 10;
        System.out.println("Initial Budget: " + totalBudget);
        System.out.println("Single Item Price: " + itemPrice);
        System.out.println("Remaining budget after 9 purchases: " + (totalBudget - 9 * itemPrice));
    }
    public static void showBadPractice1() {
        BigDecimal totalBudget = new BigDecimal("1.00");
        BigDecimal itemPrice = new BigDecimal("0.1");
        System.out.println("Initial Budget: " + totalBudget);
        System.out.println("Single Item Price: " + itemPrice);
        System.out.println("Remaining budget after 9 purchases: " + (totalBudget.subtract(itemPrice.multiply(BigDecimal.valueOf(9)))));
    }
}
