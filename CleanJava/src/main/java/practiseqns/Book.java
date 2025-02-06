package practiseqns;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an immutable Book object that cannot be modified after
 * creation.
 * 
 * Key immutability features:
 * - All fields are private and final
 * - No setter methods provided
 * - Defensive copies made of mutable objects (List<String> genres) in
 * constructor and getter
 * - Class is effectively final (not marked final but could be)
 *
 * Benefits of immutability:
 * 1. Thread Safety - Can be safely shared between threads without
 * synchronization
 * 2. Security - State cannot be modified after creation, preventing
 * bugs/vulnerabilities
 * 3. Simplicity - No need to track or manage changes to object state
 * 4. Reliability - Object state remains consistent throughout lifecycle
 * 5. Hash code stability - Safe to use as keys in HashMaps/Sets
 *
 * Usage examples:
 * Book book = new Book("Title", "Author", 100, genres);
 * String title = book.getTitle(); // Safe, returns immutable String
 * List<String> genres = book.getGenres(); // Safe, returns defensive copy
 *
 * Note: While the List<String> genres is mutable, this class maintains
 * immutability by:
 * - Creating defensive copy in constructor to prevent external list
 * modification
 * - Creating defensive copy in getter to prevent modification of internal list
 */

public class Book {
    private final String title;
    private final String author;
    private final int pageCount;
    private final List<String> genres;

    public Book(String title, String author, int pageCount, List<String> genres) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genres = new ArrayList<>(genres);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public List<String> getGenres() {
        return new ArrayList<>(genres);
    }

}
