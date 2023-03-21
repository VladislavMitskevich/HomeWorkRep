package hw_06.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateWrapper {
    /*private static final int FOUR_HUNDREDS = 400;
    private static final int ONE_HUNDREDS = 100;
    private static final int FOUR = 4;*/

    public LocalDate returnDate(int day, int month, int year) {
       /* int maxDay = 0;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    maxDay = 31;
                    break;
                case 4, 6, 9, 11:
                    maxDay = 30;
                    break;
                case 2:
                    if ((year % FOUR_HUNDREDS == 0) || (year % FOUR == 0 && year % ONE_HUNDREDS != 0)) {  доработать
                        maxDay = 29;
                    } else {
                        maxDay = 28;
                    }
                    break;
            }
        } else if (month <= 0) {
            System.out.println("You stupid");
        } else {
            year = year + month / 12;
        }
        if (day > maxDay) {
            month = month + day / maxDay;
        }*/
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateBeforeNMonth(LocalDate date, int plusNMonth) {
        return date.plusMonths(plusNMonth);
    }

    public String getLocalDateFormatterString(LocalDate date, DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    public LocalDate getStringFormatterLocalDate(String date, String formatter) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(formatter));
    }

    public long getCountDaysBetweenLocalDates(LocalDate fromDate, LocalDate toDate) {
        return ChronoUnit.DAYS.between(fromDate, toDate);
    }
}
