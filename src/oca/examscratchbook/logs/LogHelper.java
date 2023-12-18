package oca.examscratchbook.logs;

import java.util.ArrayList;
import java.util.List;

abstract class Helper {
    int num = 100;
    String operation = null;

    abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
        Double d = 3.4;
//        double v = d + null;

        List<String> strList = new ArrayList<>();

        strList.add("3223");
        strList.contains(new String("qwdq"));
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));
        System.out.println(days.size());

        if(days.contains(new StringBuilder("Sunday"))) {
            System.out.println(days.size());

            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());
        Boolean b1 = null;
        System.out.println("b1 = " + b1);

        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1 == s2);

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100);

        System.out.println(list);

    }


}