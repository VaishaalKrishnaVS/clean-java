package practiseqns.foodorders;

import java.math.BigDecimal;

/**
 * Record representing a food order with various details including item name,
 * price, quantity, delivery address, special instructions, express delivery
 * status, and discount application.
 * 
 * This record is used to encapsulate all the necessary information for a food
 * order and is immutable.
 */
public record FoodOrder(
        String itemName,
        BigDecimal itemPrice,
        int quantity,
        String deliveryAddress,
        String specialInstructions,
        boolean isExpressDelivery,
        boolean applyDiscount) {
}