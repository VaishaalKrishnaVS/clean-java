package classes.utilitysamples;

public class GoodUtiility {
    private GoodUtiility() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
