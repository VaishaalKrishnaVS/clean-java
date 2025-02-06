package classes.immutability;

import java.util.List;

public class ImmutableBook {
    private String title;
    private String author;
    private List<String> genres;

    public ImmutableBook(String title, String author, List<String> genres) {
        this.title = title;
        this.author = author;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getGenres() {
        return genres;
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
