package classes.visibillity;

import java.math.BigDecimal;

public class VisibilitySample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", BigDecimal.valueOf(1.00));
        cart.addItem("Banana", BigDecimal.valueOf(2.00));
        cart.addItem("Cherry", BigDecimal.valueOf(3.00));
        cart.displayCart();
    }
}
