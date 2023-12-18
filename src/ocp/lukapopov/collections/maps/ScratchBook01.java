package ocp.lukapopov.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ScratchBook01 {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();
        names.put(5, "John");
        names.put(11, "George");
        names.put(-2, "Luke");

        String myName = names.get(-2);
        System.out.println("myName = " + myName);

        System.out.println("\nloop over all keys");
        System.out.println(names);
        for (Integer key : names.keySet()) {
            System.out.println("Key: " + key + ", Value: " + names.get(key));
        }

        System.out.println("\nusing forEach");
        System.out.println(names);
        names.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));

        System.out.println("\njust values");
        System.out.println(names);
        names.values().forEach(System.out::println);

        System.out.println("\nusing entrySet()");
        System.out.println(names);
        names.entrySet().forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue()));

        System.out.println("\ngetOrDefault()");
        System.out.println(names);
        System.out.println("names.get(-2) = " + names.get(-2));
        System.out.println("names.get(6) = " + names.get(6));
        System.out.println("names.getOrDefault(-2, \"Name not found\") = " + names.getOrDefault(-2, "Name not found"));
        System.out.println("names.getOrDefault(6,\"Name not found\") = " + names.getOrDefault(6, "Name not found"));

        System.out.println("\nreplace()");
        System.out.println("names = " + names);
        System.out.println("names.put(5,\"John\") = " + names.put(5, "John"));
        System.out.println("names.put(11,\"George\") = " + names.put(11, "George"));
        String myName2 = names.replace(-2, "Paul");//Replaces value on key =-2 with "Paul
                                                   //but returns the old value!!
        System.out.println("myName2 = " + myName2);
        System.out.println("names = " + names);

        System.out.println("\nputIfAbsent()");
        System.out.println("names.putIfAbsent(7,\"Paul\") = " + names.putIfAbsent(7, "Paul"));
        System.out.println("names.putIfAbsent(-2, \"Ringo\") = " + names.putIfAbsent(-2, "Ringo"));
        System.out.println("names.putIfAbsent(11,null) = " + names.putIfAbsent(11, null));
        System.out.println("names = " + names);

        System.out.println("\nmerge()");
        BiFunction<String,String,String>myLogic=(name1,name2)->name1.length()>name2.length()?name1:name2;
        System.out.println("(name1,name2)->name1.length()>name2.length()?name1:name2\n" +
                "insert name only if it is longer than the original name");
        System.out.println("names.merge(5,\"Joe\",myLogic) = " + names.merge(5, "Joe", myLogic));
        System.out.println("names.merge(-2,\"Lucas\",myLogic) = " + names.merge(-2, "Lucas", myLogic));
        System.out.println("names.merge(7,\"Paul\",myLogic) = " + names.merge(7, "Paul", myLogic));
        System.out.println("names = " + names);

    }
}
