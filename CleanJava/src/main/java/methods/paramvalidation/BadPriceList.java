package methods.paramvalidation;

import java.math.BigDecimal;
import java.util.List;

public class BadPriceList {
    private final List<BigDecimal> prices;

    public BadPriceList(List<BigDecimal> prices) {
        this.prices = prices;
    }

    public BigDecimal getPriceSum() {
        return prices.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BadPriceList emptyPriceList() {
        return new BadPriceList(List.of());
    }

    public void addPrice(BigDecimal price) {
        prices.add(price);
    }

}
