package methods.paramvalidation;

import java.math.BigDecimal;

public class ParamValidationSample {

    public static void main(String[] args) {
        System.out.println("Bad Sample");
        showBadSample();

        System.out.println("Good Sample");
        showGoodSample();
    }

    public static void showBadSample() {
        var priceListNull = BadPriceList.emptyPriceList();
        priceListNull.addPrice(null);
        System.out.println("sum: " + priceListNull.getPriceSum());

        var priceListNegative = BadPriceList.emptyPriceList();
        priceListNegative.addPrice(BigDecimal.valueOf(-100));
        priceListNegative.addPrice(BigDecimal.valueOf(50));
        System.out.println("sum: " + priceListNegative.getPriceSum());
    }

    public static void showGoodSample() {
        var priceListNull = GoodPriceList.emptyPriceList();
        priceListNull.addPrice(null);
        System.out.println("sum: " + priceListNull.getPriceSum());

        var priceListNegative = GoodPriceList.emptyPriceList();
        priceListNegative.addPrice(BigDecimal.valueOf(-100));
        priceListNegative.addPrice(BigDecimal.valueOf(50));
        System.out.println("sum: " + priceListNegative.getPriceSum());
    }
}
