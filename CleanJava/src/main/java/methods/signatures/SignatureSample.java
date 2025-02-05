package methods.signatures;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates good and bad practices for method signatures and
 * parameter handling.
 * 
 * The class contains two versions of a helper function that counts numbers
 * within a given range:
 * 
 * Bad Practice ({@link #helperFn(List, int, int, int, int)}):
 * - Uses multiple primitive parameters that are related but passed separately
 * - Parameter names are generic and don't clearly convey their purpose
 * - Order of parameters is not intuitive and prone to errors
 * - Difficult to understand the relationship between parameters
 * 
 * Good Practice ({@link #helperFn(List, SearchIndexRange, SearchValueRange)}):
 * - Groups related parameters into meaningful objects (SearchIndexRange,
 * SearchValueRange)
 * - Parameter names and types clearly indicate their purpose
 * - Reduces cognitive load by having fewer parameters
 * - Makes the code more maintainable and less error-prone
 * 
 * The class also demonstrates the use of records ({@link SearchIndexRange} and
 * {@link SearchValueRange})
 * to create immutable data carriers for related parameters.
 * 
 * @see SearchIndexRange
 * @see SearchValueRange
 */

public class SignatureSample {
    public static void main(String[] args) {
        System.out.println("Bad Sample");
        showBadSample();

        System.out.println("Good Sample");
        showGoodSample();
    }

    public static void showBadSample() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println("Some number: " + helperFn(new ArrayList<>(numbers), 2, 7, 1, 14));
    }

    public static int helperFn(List<Integer> array, int min, int max, int skip, int finish) {
        // param validation skipped
        int counter = 0;
        for (int i = skip; i < finish; i++) {
            if (array.get(i) >= min && array.get(i) <= max) {
                counter++;
            }
        }
        return counter;
    }

    public static void showGoodSample() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        SearchIndexRange searchIndexRange = new SearchIndexRange(2, 7);
        SearchValueRange searchValueRange = new SearchValueRange(1, 14);
        System.out.println("Some number: " + helperFn(numbers, searchIndexRange, searchValueRange));
    }

    public static int helperFn(List<Integer> numbers, SearchIndexRange searchRange, SearchValueRange valueRange) {
        // param validation skipped
        int counter = 0;
        for (int i = searchRange.startIndex(); i < searchRange.finishIndex(); i++) {
            if (numbers.get(i) >= valueRange.minValue && numbers.get(i) <= valueRange.maxValue) {
                counter++;
            }
        }
        return counter;

    }

    record SearchIndexRange(int startIndex, int finishIndex) {
    }

    record SearchValueRange(int minValue, int maxValue) {
    }

}
