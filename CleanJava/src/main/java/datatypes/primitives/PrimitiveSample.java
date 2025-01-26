package datatypes.primitives;

public class PrimitiveSample {
    static Integer internalSampleNumber;

    public static void main(String[] args) {
//        showBadPractiseNulls();

        System.out.println("Bad Practise of Integer");
        long startTime = System.currentTimeMillis();
        showBadPractise();
        System.out.println("Time spent for Bad practise: " + (System.currentTimeMillis() - startTime));

        System.out.println("Good Practise of int");
        startTime = System.currentTimeMillis();
        showGoodPractise();
        System.out.println("Time spent for Good practise: " + (System.currentTimeMillis() - startTime));
    }

    public static void showBadPractiseNulls() {
        if(internalSampleNumber == 108) {
            System.out.println("The internal number value is 108");
        }
        else {
            System.out.println("The internal number value is "+ internalSampleNumber);
        }
    }
    public static void showBadPractise() {
        Integer sum = 0;
        for(int i=0;i<1_000_000;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void showGoodPractise() {
        int sum = 0;
        for(int i=0;i<1_000_000;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
