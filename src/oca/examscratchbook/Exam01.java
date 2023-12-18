package oca.examscratchbook;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class Exam01 {
     static public void main(String[] args) {
        double d = 80;
        if (d > 2) {
            System.out.println("t");
        }
//        short args =23;
//        double [] arr = new int[2];

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ArrayList<Long>longs = (ArrayList<Long>)ints.clone();
//        List<String> list = new List<>();
         byte bbb = 127;
        byte var = 2;
        switch (var) {
            case 2:

        }

         StringBuilder sb = new StringBuilder();
//         System.out.println(sb.append(null).length());
         System.out.println(sb.append(Optional.ofNullable(null)).length());


//        main(args);
        int t = '5';
        Period period = Period.of(0, 0, 0);
        System.out.println(period);//P0D

         period.ofYears(-12222);
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());

        m1();

        LocalDate date = LocalDate.of(2020, 9, 31);
        System.out.println(date);

         Object [] arr = new Object[4];
         for(int i = 1; i <=3; i++) {
             switch(i) {
                 case 1:
                     arr[i] = new String("Java");
                     break;
                 case 2:
                     arr[i] = new StringBuilder("Java");
                     break;
                 case 3:
                     arr[i] = new SpecialString("Java");
                     break;
             }
         }

    }
    private static void m1 (){
        System.out.println("ttt");
    }
    Predicate predicate ;


}
class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}