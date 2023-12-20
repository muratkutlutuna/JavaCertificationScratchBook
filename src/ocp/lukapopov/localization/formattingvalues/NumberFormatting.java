package ocp.lukapopov.localization.formattingvalues;

import java.text.*;

public class NumberFormatting {
    public static void main(String[] args) {
        double num = 12345.6789;

        NumberFormat nF1 = new DecimalFormat("###,###,###.0");
        System.out.println(nF1.format(num));

        NumberFormat f2 = new DecimalFormat("000,000.000000");
        System.out.println(f2.format(num));

        NumberFormat f3 = new DecimalFormat("My Balance: $#,###,###.##");
        System.out.println(f3.format(num));
    }
}
