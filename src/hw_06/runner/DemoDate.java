package hw_06.runner;

import hw_06.date.DateWrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DemoDate {
    public static void main(String[] args) {
        DateWrapper date = new DateWrapper();
        int year = 2022;
        int month = 11;
        int day = 3;
        LocalDate date1 = date.returnDate(day, month, year);
        LocalDate date2 = date.returnDate(13, 4, 2042);
        System.out.println(date1);
        System.out.println(date.getLocalDateBeforeNMonth(date1, 5));
        System.out.println(date.getLocalDateFormatterString(date1, DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.US)));
        System.out.println(date.getStringFormatterLocalDate("11.3.2022", "MM.d.yyyy"));
        System.out.println(date.getCountDaysBetweenLocalDates(date1, date2));
        System.out.println();

        /*LocalDate localDate = LocalDate.of(2022, 10, 31);
        System.out.println(localDate.with(new AddDaysAdjuster(6)));
        System.out.println();

        LocalDate localDate2 = LocalDate.of(2020, 1, 1);
        System.out.println(localDate2.with(new ChangeDateFirstDayOfYear()));*/
    }
}

