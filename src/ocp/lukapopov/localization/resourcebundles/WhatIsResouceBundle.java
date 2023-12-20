package ocp.lukapopov.localization.resourcebundles;


import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * --peoperties file which contains the locale-specific objects for the program
 * ----basicly a map with keys and values
 * --the keys and values in property file are separated either by = or:
 * --property file name is like this: Musem_en.properties
 * ----<name_of_the_bundle>_<target_locale>.properties
 * --to load a resource bundle
 *      ResourceBundle.getBundle(bundle,locale)
 *
 *
 *
 */
public class WhatIsResouceBundle {

    public static void main(String[] args) {
        var enRb = ResourceBundle.getBundle("ocp.lukapopov.localization.resourcebundles.Museum", Locale.US);
                                                                //can be omitted(default locale will be used)
        var itRb = ResourceBundle.getBundle("ocp.lukapopov.localization.resourcebundles.Museum", new Locale("it", "IT"));
        System.out.println(itRb.getString("greeting")+"! "+enRb.getString("open"));

        //formatting messages (import java.text.*)
        //check file Museum_it_IT.properties
        //in main method
        String greet = itRb.getString("greetByName");
        System.out.println(MessageFormat.format(greet, "Bruno", "Mario"));


        //using properties class to define properties outside rb file
        var p = new Properties();
        p.setProperty("name", "Natural Museum");

        System.out.println("Welcome to " + p.getProperty("name"));
        //works like HashMap with string key and values



    }
}
