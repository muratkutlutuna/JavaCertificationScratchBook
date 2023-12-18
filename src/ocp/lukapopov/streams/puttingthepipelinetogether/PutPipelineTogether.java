package ocp.lukapopov.streams.puttingthepipelinetogether;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PutPipelineTogether {
    public static void main(String[] args) {
        //example: for given list of names get first two names which are
        //four characters long, in an alphabetical order
        //the old way:
        var list = List.of("John", "George", "Ben");
        List<String> filtered = new ArrayList<>();
        for (String name :
                list) {
            if (name.length() == 4) {
                filtered.add(name);
            }
        }
        Collections.sort(filtered);
        var iter = filtered.iterator();
        if(iter.hasNext()) System.out.println(iter.next());
        if(iter.hasNext()) System.out.println(iter.next());


        System.out.println("\n");
        //same thing, but using streams
        list = List.of("John", "George", "Ben");
        list.stream()//source
                .filter(n->n.length()==4)
                .sorted()
                .limit(2)//intermediate operations
                .forEach(System.out::print);//terminal operation

        System.out.println("\n");
        //you can chain more pipelines together
        long count = Stream.of("John", "George", "Paul", "Ringo")//source
                .filter(s -> s.length() > 4)//intermediate operation
                .collect(Collectors.toList())//terminal operation
                .stream()//source
                .count();//terminal operation
        System.out.println("count = " + count);

    }
}
