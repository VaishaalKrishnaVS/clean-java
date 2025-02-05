package methods.returntypes;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {
        System.out.println("Bad Practice");
        showBadPractice();
        System.out.println("Good Practice");
        showGoodPractice();
    }

    private static void showBadPractice() {
        var numberList = getNaturalNumbersAsStringListBadPractice(0);
        if (numberList != null) {
            numberList.forEach(element -> System.out.println("List element: " + element));
        }
    }

    private static List<String> getNaturalNumbersAsStringListBadPractice(int max) {
        if (max < 0) {
            return null;
        }
        var numbers = new ArrayList<String>();
        for (int i = 0; i <= max; i++) {
            numbers.add(String.valueOf(i));
        }
        return numbers;
    }

    private static void showGoodPractice() {
        var numberList = getNaturalNumbersAsStringListGoodPractice(0);
        numberList.forEach(element -> System.out.println("List element: " + element));
    }

    private static List<String> getNaturalNumbersAsStringListGoodPractice(int max) {
        List<String> numbers = new ArrayList<String>();
        for (int i = 0; i <= max; i++) {
            numbers.add(String.valueOf(i));
        }
        return numbers;
    }

}
