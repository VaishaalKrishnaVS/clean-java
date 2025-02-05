package methods.returntypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GeneralSample {
    public static void main(String[] args) {
        System.out.println("Bad Practice");
        showBadPractice();
        System.out.println("Good Practice");
        showGoodPractice();
    }

    // Magic String Constants
    // Using "NOT FOUND" as a magic string constant to indicate no results is a poor
    // practice
    // Magic strings are hard to maintain and prone to typos
    // If the string needs to change, you'd need to update it in multiple places
    // Null Returns
    // getLongestWordNull() returns null to indicate absence of a value
    // Null returns are considered a bad practice in modern Java because:
    // They can cause NullPointerExceptions
    // They require explicit null checks everywhere the method is used
    // They don't clearly communicate the intent
    // They make the code less type-safe
    // Inconsistent Return Types
    // The code demonstrates two different approaches for handling the same problem
    // This inconsistency makes the code harder to maintain and understand
    // It forces developers to remember different handling patterns
    private static void showBadPractice() {
        List<String> words = new ArrayList<>();

        System.out.println("The longest word is: " + getLongestWordMagicWord(words));

        String longestWord = getLongestWordMagicWord(words);
        if (longestWord.equals("NOT FOUND")) {
            System.out.println("No words found");
        } else {
            System.out.println("The longest word is: " + longestWord);
        }

        System.out.println("The longest word is: " + getLongestWordNull(words));

        String longestWordNull = getLongestWordNull(words);
        if (longestWordNull == null) {
            System.out.println("No words found");
        } else {
            System.out.println("The longest word is: " + longestWordNull);
        }
    }

    private static String getLongestWordMagicWord(List<String> words) {
        if (words.isEmpty()) {
            return "NOT FOUND";
        }
        return Collections.max(words, Comparator.comparing(String::length));
    }

    private static String getLongestWordNull(List<String> words) {
        if (words.isEmpty()) {
            return null;
        }
        return Collections.max(words, Comparator.comparing(String::length));
    }

    // Best Practice
    // 1. Throwing Exceptions
    // - Use exceptions to signal truly exceptional conditions
    // - Makes it impossible for caller to ignore error conditions
    // - Provides stack trace and detailed error information
    // - Best for programming errors or unrecoverable situations

    // 2. Using Optional
    // - Explicitly models absence of value in type system
    // - Forces caller to consider both present and absent cases
    // - Provides useful methods like map(), filter(), orElse()
    // - Best for methods that may naturally have no result

    // 3. Using Default Values
    // - Returns sensible fallback when actual value unavailable
    // - Simplifies calling code by eliminating special cases
    // - Makes code more robust by avoiding null checks
    // - Best when a reasonable default exists
    private static void showGoodPractice() {
        // exception
        List<String> words = Collections.emptyList();
        try {
            System.out.println("The longest word is: " + getLongestStringException(words));
        } catch (IllegalArgumentException ex) {
            System.out.println("You did not provide any words!");
        }

        // Optional
        Optional<String> longestWord = getLongestStringOptional(words);
        if (longestWord.isPresent()) {
            System.out.println("The longest word is: " + longestWord.get());
        }

        // resonable default value
        String longestWordDefault = getLongestStringDefault(words);
        System.out.println("The longest word is: " + longestWordDefault);
    }

    private static String getLongestStringException(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("You did not provide any words!");
        }
        return Collections.max(words, Comparator.comparing(String::length));
    }

    private static Optional<String> getLongestStringOptional(List<String> words) {
        if (words.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(Collections.max(words, Comparator.comparing(String::length)));
    }

    private static String getLongestStringDefault(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }
        return Collections.max(words, Comparator.comparing(String::length));
    }
}
