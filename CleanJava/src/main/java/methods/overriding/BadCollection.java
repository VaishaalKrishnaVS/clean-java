package methods.overriding;

import java.util.Objects;

public class BadCollection {
    private final String c1;
    private final String c2;

    public BadCollection(String c1, String c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean equals(BadCollection second) {
        return Objects.equals(this.c1, second.c1) && Objects.equals(this.c2, second.c2);
    }

    public int hashCode() {
        return Objects.hash(c1, c2);
    }

}
