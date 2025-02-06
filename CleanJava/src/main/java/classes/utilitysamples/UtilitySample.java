package classes.utilitysamples;

/**
 * This class demonstrates good and bad practices for utility classes.
 * 
 * Bad practices shown:
 * - BadUtility allows instantiation which is unnecessary for utility classes
 * - Methods are accessed through instance rather than statically
 * - No private constructor to prevent instantiation
 * 
 * Good practices shown:
 * - GoodUtility has a private constructor that throws exception
 * - Methods are accessed statically as intended for utility classes
 * - Class is well documented and follows single responsibility principle
 */
/**
 * Why utility classes should not be instantiated:
 * 1. Utility classes contain only static methods and fields - no instance state
 * 2. Creating objects wastes memory since no instance data is needed
 * 3. Multiple instances create confusion - static methods should be called
 * directly on class
 * 4. Goes against utility class design pattern which is meant to group related
 * static functionality
 * 5. Can lead to inconsistent usage across codebase (some using static, others
 * instantiating)
 *
 * Best practices:
 * - Make constructor private
 * - Throw exception in constructor to prevent reflection
 * - Document class as utility
 * - Access methods statically
 */

public class UtilitySample {
    public static void main(String[] args) {
        System.out.println("Bad code example");
        showBadExample();

        System.out.println("Good code example");
        showGoodExample();
    }

    private static void showBadExample() {
        // BadUtility utility = new BadUtility();
        // System.out.println(utility.isNullOrEmpty("Hello"));
        // System.out.println(utility.reverseString("Hello"));

    }

    private static void showGoodExample() {
        System.out.println(GoodUtiility.isNullOrEmpty("Hello"));
        System.out.println(GoodUtiility.reverseString("Hello"));
    }
}
