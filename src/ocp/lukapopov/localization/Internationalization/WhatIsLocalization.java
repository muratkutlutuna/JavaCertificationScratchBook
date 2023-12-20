package ocp.lukapopov.localization.Internationalization;


import java.util.Locale;

/**
 *
 *
 * --translating string to different languages
 * --outputting dates in the correct format
 * --outputting numbers in the correct format
 * etc.
 *
 *
 */
public class WhatIsLocalization {

    public static void main(String[] args) {

        //picking a local
        Locale myDefaultLocale = Locale.getDefault();
        System.out.println("myDefaultLocale = " + myDefaultLocale);
        //                 en_GB
        //language(mandatory) country(optional)

        System.out.println("Locale.ITALIAN = " + Locale.ITALIAN);//it
        System.out.println("Locale.ITALY = " + Locale.ITALY);//it_IT
        System.out.println(new Locale("hi","IN"));

        //creating a locale
        Locale myLocale = new Locale.Builder()
                .setLanguage("en").setRegion("US")//could be in any order
                .build();

        //get default locale
        System.out.println("Locale.getDefault() = " + Locale.getDefault());

        //change default locale
        Locale locale = new Locale("fr");
        Locale.setDefault(locale);
        System.out.println("Locale.getDefault() = " + Locale.getDefault());
    }

}
