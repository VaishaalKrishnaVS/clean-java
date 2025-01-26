package datatypes.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

public class DateTimeSample {
    public static void main(String[] args) {
        System.out.println("\n-- GOOD PRACTICE: DATES --");
        showGoodPracticeDate();

        System.out.println("\n-- GOOD PRACTICE: TIME --");
        showGoodPracticeTime();
    }
    private static void showGoodPracticeDate() {
        // new API from Java 8
        LocalDate firstDate = LocalDate.of(2023, Month.OCTOBER, 22);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
        System.out.println(formatter.format(firstDate));

        LocalDate secondDate = LocalDate.parse("09 May 2022", formatter);
        System.out.println("Day of month: " + secondDate.getDayOfMonth());
    }

    private static void showGoodPracticeTime() {
        // UTC
        Instant nowUtc = Instant.now();
        System.out.println("Time now [UTC]: " + nowUtc);

        // local time
        ZonedDateTime nowLocalTimezone = ZonedDateTime.now();
        System.out.println("Time now [local]: " + nowLocalTimezone);

        // time in New York
        ZonedDateTime nowNewYork = ZonedDateTime.now(TimeZone.getTimeZone("America/New_York").toZoneId());
        System.out.println("Time now [New York]: " + nowNewYork);
    }
}
