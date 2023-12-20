package ocp.lukapopov.localization.Internationalization;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatting {
    public static void main(String[] args) {
        //localizing dates and times
        var dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        var fr = new Locale("fr","FR");
        var dt = LocalDateTime.of(2023, Month.SEPTEMBER, 14, 9, 14, 57);
        System.out.println("dtf.withLocale(fr).format(dt) = " + dtf.withLocale(fr).format(dt));
        System.out.println(
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.LONG)
                        .withLocale(
                                new Locale("en","US"))
                        .format(
                                LocalDateTime.of(2023,11,11,11,11,11)
                        )
        );

        System.out.println("\n");
        //displaying locale
        var hr = new Locale("hr", "HR");
        var price = 4.32;
        System.out.println("hr.getDisplayLanguage() = " + hr.getDisplayLanguage());
        System.out.println("hr.getDisplayCountry() = " + hr.getDisplayCountry());
        System.out.println("NumberFormat.getCurrencyInstance(hr).format(price) = "
                + NumberFormat.getCurrencyInstance(hr).format(price));




    }
}
