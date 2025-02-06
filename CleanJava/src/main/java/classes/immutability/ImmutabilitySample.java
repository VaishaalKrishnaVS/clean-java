package classes.immutability;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class demonstrates good and bad practices for immutable classes.
 *
 * Bad practices shown in ImmutableBook:
 * - Constructor stores reference to mutable List parameter directly
 * - Getter returns reference to internal mutable List
 * - Both allow external code to modify the supposedly immutable object's state
 *
 * Good practices shown in GoodImmutableBook:
 * - Constructor creates defensive copy of List parameter
 * - Getter returns defensive copy of internal List
 * - External changes to input/output Lists cannot affect immutable object
 *
 * Why immutability matters:
 * 1. Thread safety - immutable objects can be safely shared between threads
 * 2. Security - state cannot be modified after creation
 * 3. Simplicity - no need to track/manage changes to object state
 * 4. Reliability - object state remains consistent throughout lifecycle
 */

public class ImmutabilitySample {
    public static void main(String[] args) {
        System.out.println("Bad code example");
        showBadPractice();

        System.out.println("Good code example");
        showGoodPractice();
    }

    private static void showBadPractice() {
        var sneakyGenres = new ArrayList<>(Arrays.asList("fantasy", "science"));
        var book = new ImmutableBook("The life of Java", "John Doe", sneakyGenres);
        System.out.println(book);
        // problem 1: can modify sneakyGenres
        sneakyGenres.clear();
        System.out.println(book);

        // problem 2: can access the mutable list using a getter
        var genres = book.getGenres();
        genres.add("surprise!");
        System.out.println(book);
    }

    private static void showGoodPractice() {
        var sneakyGenres = new ArrayList<>(Arrays.asList("fantasy", "science"));
        var book = new GoodImmutableBook("The life of Java", "John Doe", sneakyGenres);
        System.out.println(book);
        // problem 1: can modify sneakyGenres
        sneakyGenres.clear();
        System.out.println(book);

        // problem 2: can access the mutable list using a getter
        var genres = book.getGenres();
        genres.add("surprise!");
        System.out.println(book);
    }

}
