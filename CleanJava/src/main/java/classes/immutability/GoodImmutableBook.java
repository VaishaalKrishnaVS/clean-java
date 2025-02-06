package classes.immutability;

import java.util.ArrayList;
import java.util.List;

public class GoodImmutableBook {
    private String title;
    private String author;
    private List<String> genres;

    public GoodImmutableBook(String title, String author, List<String> genres) {
        this.title = title;
        this.author = author;
        this.genres = new ArrayList<>(genres);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getGenres() {
        return new ArrayList<>(genres);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genres=" + genres +
                '}';
    }
}
