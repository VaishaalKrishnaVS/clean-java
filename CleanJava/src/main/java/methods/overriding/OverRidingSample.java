package methods.overriding;

import java.util.HashSet;

public class OverRidingSample {

    public static void main(String[] args) {
        System.out.println("Bad Sample");
        showBadSample();

        System.out.println("Good Sample");
        showGoodSample();
    }

    public static void showBadSample() {
        HashSet<BadCollection> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(new BadCollection("AWS", "DEF"));
        }
        System.out.println("Size: " + hashSet.size());

    }

    public static void showGoodSample() {
        HashSet<GoodCollection> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(new GoodCollection("AWS", "DEF"));
        }
        System.out.println("Size: " + hashSet.size());
    }

}
