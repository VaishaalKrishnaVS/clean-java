package datatypes.stringconcat;

import java.util.StringJoiner;

public class StringConcatSample {
    public static void main(String[] args) {
        System.out.println("Bad Practise of concatenation");
        long startTime = System.currentTimeMillis();
        showBadPractise();
        System.out.println("Bad Practise of concatenation took " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println("Good Practise of concatenation:: Using StringBuilder");
        startTime = System.currentTimeMillis();
        showGoodPractise();
        System.out.println("Good Practise of concatenation took " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println("Other String Methods are: StringBuffer and StringJoiner");

        System.out.println("StringBuffer");
        startTime = System.currentTimeMillis();
        showGoodPractiseStringBuffer();
        System.out.println("StringBuffer took " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println("StringJoiner");
        startTime = System.currentTimeMillis();
        showGoodPractiseStringJoiner();
        System.out.println("StringJoiner took " + (System.currentTimeMillis() - startTime) + " ms");
    }
    private static void showBadPractise() {
        String str = "";
        for(int i=0;i<10_000;i++){
            str += i;
        }
        System.out.println(str);
    }
    private static void showGoodPractise() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10_000;i++){
            sb.append("a");
        }
        System.out.println(sb);
    }
    private static void showGoodPractiseStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10_000;i++){
            sb.append("a");
        }
        System.out.println(sb);
    }
    private static void showGoodPractiseStringJoiner() {
        StringJoiner sj = new StringJoiner("");
        for(int i=0;i<10_000;i++){
            sj.add("a");
        }
        System.out.println(sj);
    }
}
