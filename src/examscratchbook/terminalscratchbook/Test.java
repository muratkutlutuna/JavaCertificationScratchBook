package examscratchbook.terminalscratchbook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(args.length);

        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;

        StringBuilder sb = new StringBuilder("sad434fg   rwgf 434");
        System.out.println(sb);
        System.out.println(sb.delete(0, 100));
        System.out.println(sb);
        Trying.main(args);

        List<String> list = new ArrayList<>();
    }
}

class Trying {
    public static void main(String[] args) {
        System.out.println("Welcome " + args[0] + "!");
        LocalDate.of(1222, 1, 1);
        LocalDate.parse("2022-02-02");
    }
}
