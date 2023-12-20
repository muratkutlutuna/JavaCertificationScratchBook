package ocp.lukapopov.localization.Internationalization;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * NumberFormat Factory Methods
 * Method                                   Dexcription
 * getInstance()                            General purpose formatter
 * getInstance(Locale locale)
 * getNumberInstance()                      Same as getInstance
 * getNumberInstance(Locale locale)
 * getCurrencyInstance()                    For formatting monetary amounts
 * getCurrencyInstance(Locale locale)
 * getPercentageInstance()                  For formatting percentage
 * getPercentageInstance(Locale locale)
 * getIntegerInstance()                     Rounds decimal numbers before displaying
 * getIntegerInstance(Locale locale)
 * getCompactNumberInstance()               Returns compact number formatter
 * getInstance(Locale l, Style s)
 *
 */
public class LocalizingNumbers {
    public static void main(String[] args) {
        //formatting numbers
        double myNum = 1234.5678;
        var us = NumberFormat.getInstance(Locale.US);
        System.out.println("us.format(myNum) = " + us.format(myNum));
        var it = NumberFormat.getInstance(Locale.ITALY);
        System.out.println("it.format(myNum) = " + it.format(myNum));
        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println("ca.format(myNum) = " + ca.format(myNum));

        //fromatting currencies
        double price = 12.3;
        us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("us.format(price) = " + us.format(price));
        var uk = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("uk.format(price) = " + uk.format(price));
        NumberFormat ger = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println("ger.format(price) = " + ger.format(price));

        // formatting percentages
        double discount = 0.151;
        us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println("us.format(discount) = " + us.format(discount));
        ger = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println("ger.format(discount) = " + ger.format(discount));

        //parsing numbers
        try {
            String myNumber = "15.72";
            us = NumberFormat.getInstance(Locale.US);
            System.out.println(us.parse(myNumber));

            var fr = NumberFormat.getPercentInstance(Locale.FRANCE);
            System.out.println("fr.parse(myNumber) = " + fr.parse(myNumber));
        } catch (ParseException e) {
            System.out.println(e.getMessage());// in france, decimal point is not a dot, but a comma
        }

        System.out.println("\n");
        //parsing numbers with currency
        try {
            String USDprice = "$12,345.67";
            us = NumberFormat.getCurrencyInstance(Locale.US);
            double USDpriceValue = (Double) us.parse(USDprice);
            System.out.println("USDpriceValue = " + USDpriceValue);
        } catch (ParseException e) {
            System.out.println(e.getMessage()); //NOTE: if you use non-us like locale,
                                                // the parsing will throw an exception
        }


        //using CompactNumberFormat (new in Java 17!)
        int num = 8_765_432;
        var us1 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println("us1.format(num) = " + us1.format(num));

        var us2 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println("us2.format(num) = " + us2.format(num));
        var ger1 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);
        System.out.println("ger1.format(num) = " + ger1.format(num));
        var ger2 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG);
        System.out.println("ger2.format(num) = " + ger2.format(num));




//        Section 17 lecture 80 Internationalization 15:00
    }
}
