package methods.overriding;

import java.util.Objects;

public class GoodCollection {
    private final String c1;
    private final String c2;

    public GoodCollection(String c1, String c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        GoodCollection that = (GoodCollection) obj;
        return Objects.equals(c1, that.c1) && Objects.equals(c2, that.c2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c1, c2);
    }

}
