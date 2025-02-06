package classes.visibillity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A shopping cart that holds items and their total price.
 * The cart allows adding items with valid prices and displaying the cart
 * contents.
 * Package-private visibility is used since this class is only needed within the
 * visibility package.
 */

class ShoppingCart {
    private List<String> items;
    private BigDecimal total;

    ShoppingCart() {
        items = new ArrayList<>();
        total = BigDecimal.ZERO;
    }

    void addItem(String name, BigDecimal price) {
        if (isValidPrice(price)) {
            items.add(name);
            total = total.add(price);
        }
    }

    private boolean isValidPrice(BigDecimal price) {
        return price != null && price.compareTo(BigDecimal.ZERO) > 0;
    }

    void displayCart() {
        System.out.println("Shopping Cart");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Total: " + total);
    }
}
