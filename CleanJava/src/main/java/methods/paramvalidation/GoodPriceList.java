package methods.paramvalidation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class GoodPriceList {
    private final List<BigDecimal> prices;

    public GoodPriceList(List<BigDecimal> prices) {
        this.prices = prices;
    }

    public BigDecimal getPriceSum() {
        return prices.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static GoodPriceList emptyPriceList() {
        return new GoodPriceList(List.of());
    }

    public void addPrice(BigDecimal price) {
        Objects.requireNonNull(price);
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        prices.add(price);
    }

}
