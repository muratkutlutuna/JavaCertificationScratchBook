package ocp.lukapopov.io.consoleclass;

import java.io.Console;
import java.util.Arrays;

public class MyConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if(console!=null){
            String myName = console.readLine("What is your name? ");
            console.format("Hello, %s!%n", myName);
            console.writer().println("-".repeat(30));

            char[] password = console.readPassword("Please enter the password: ");
            char[] repeatPassword = console.readPassword("Please verify the password: ");

            if (Arrays.equals(password, repeatPassword)) {
                console.printf("Password sauccessfully set.%n");
            } else {
                console.printf("ERROR: passwords do not match!%n");
            }

        }else{
            System.err.println("Console unavailable!");
        }

    }
}
