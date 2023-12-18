package oca.examscratchbook.strings;

import java.util.ArrayList;
import java.util.List;

public class StringConcatenation {
    String StringConcatenation;
    public static void main(String[] args) {
        String fName = "James";
        System.out.println("final String fName = \"James\" ===> " + System.identityHashCode(fName));
        String lName = "Gosling";
        System.out.println("String lName = \"Gosling\" ===> " + System.identityHashCode(lName));
        String name1 = fName + lName;
        System.out.println("String name1 = fName + lName ===> " + System.identityHashCode(name1));
        String name2 = fName + "Gosling";
        System.out.println("String name2 = fName + \"Gosling\" ===> " + System.identityHashCode(name2));
        String name3 = "James" + "Gosling";
        System.out.println("String name3 = \"James\" + \"Gosling\" ===> " + System.identityHashCode(name3));
        System.out.println("name1 == name2 ===> " + (name1 == name2));
        System.out.println("name2 == name3 ===> " + (name2 == name3));
        StringConcatenation s = new StringConcatenation();
        System.out.println(s.StringConcatenation);
        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException arithmeticException) {
            ans = 3;
//        } catch (Exception e) {
//            System.out.println("asd");
        }

            System.out.println(ans);

        char ccolorCode = 'y';
        switch (ccolorCode) {
            case 'r':
                int color = 100;
                break;
            case 'b':
                color = 10;
                break;
            case 'y':
                color = 1;
                break;
        }
        List<String> strList = new ArrayList<>();
//        System.out.println(color);

        StringBuilder sb = new StringBuilder("34");
        sb.length();

    }
//    private StringConcatenation(){
//
//    }
//
//    StringConcatenation(int i) {
//
//    }
}
