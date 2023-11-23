package examscratchbook.studentlist;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add(new String("a"));
        for(String str : strs) {
            System.out.println(str);
        }
        System.out.println();
        strs.add(new String("b"));
        for(String str : strs) {
            System.out.println(str);
        }
        System.out.println();
        strs.add(new String("c"));
        for(String str : strs) {
            System.out.println(str);
        }
        System.out.println();
        strs.add(new String("d"));
        for(String str : strs) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println(strs.remove(new String("c")));
        for(String str : strs) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println(new String("e"));
        System.out.println();
        for(String str : strs) {
            System.out.println(str);
        }
    }
}
