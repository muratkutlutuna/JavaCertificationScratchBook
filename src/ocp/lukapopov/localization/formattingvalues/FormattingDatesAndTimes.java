package ocp.lukapopov.localization.formattingvalues;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 * Common date/time symbols
 * Symbol   Meaning             Example
 * y        Year                23,2023
 * M        Month               2, 02, Feb, February
 * d        Day                 7, 07
 * h        Hour                8, 08
 * m        Minute              25
 * S        Second              17
 * a        a.m. / p.m.         AM, PM
 * z        Time zone name      Central European Time, CET
 * Z        Time zone offset    -600
 */
public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, Month.SEPTEMBER, 14);
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());

        //to display standard formats
        date = LocalDate.of(2023, Month.SEPTEMBER, 14);
        LocalTime time = LocalTime.of(9, 6, 24);
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println("date.format(DateTimeFormatter.ISO_LOCAL_DATE) = "
                + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("time.format(DateTimeFormatter.ISO_LOCAL_TIME) = "
                + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) = "
                + dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        //creating custom formats
        dt = LocalDateTime.of(2022, Month.SEPTEMBER, 14, 19, 6, 14);
        var f1 = DateTimeFormatter.ofPattern("dd.MM.yyyy.hh:mm:ss");
        System.out.println("dt.format(f1) = " + dt.format(f1));

        var f2 = DateTimeFormatter.ofPattern("MMM-dd-yy HH:mm:ss");
        System.out.println("dt.format(f2) = " + dt.format(f2));

        var f3 = DateTimeFormatter.ofPattern("MMMM-dd-yy hh:mm:ss a");
        System.out.println("dt.format(f3) = " + dt.format(f3));
        //alternative
        System.out.println("f3.format(dt) = " + f3.format(dt));

        //to insert text values use single quotes
        var f4 = DateTimeFormatter.ofPattern("'Date:' dd.MM.yy. '| Time:' hh:mm:ss a");
        System.out.println("f4.format(dt)  ==>  \n\"'Date:' dd.MM.yy. '| Time:' hh:mm:ss a\"  ==>  \n" + f4.format(dt));

        var f5 = DateTimeFormatter.ofPattern("MMM-dd-yyyy 'at' HH'h'm'm'ss's'");
        System.out.println("f5.format(dt) = " + f5.format(dt));

        //NOTE: spaces can be added within or out of the single quotes
    }
}
