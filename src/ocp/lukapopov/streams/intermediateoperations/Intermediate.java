package ocp.lukapopov.streams.intermediateoperations;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * - takes a stream produces another stream
 * - can deal with infinite streams by returning another infinite stream
 * - can be omitted in a pipeline unlike source and terminal operations
 */
public class Intermediate {
    public static void main(String[] args) {
        //filtering
        Stream<String> names = Stream.of("John", "George", "Ben");
        names.//source
                filter(s -> s.startsWith("G")).//intermediate operation, argument of filter() is predicate
                forEach(System.out::print);//terminal operation


        System.out.println("\n");
        //removing duplicates
        Stream<String> name = Stream.of("John", "John", "John", "Ben");
        name.
                distinct(). //intermediate operation
                forEach(System.out::print);


        System.out.println("\n");
        //restricting by position
        Stream<Integer>numbers=Stream.iterate(1,n->n+1);//infinite stream of numbers starting from 1
        numbers.
                skip(3).//create a stream by skipping first 3 elements from the source stream
                limit(4).//create a stream using first 4 elements from the previous stream
                forEach(System.out::print); //terminate a stream

        System.out.println("\n");
        //mapping using map()
        names = Stream.of("John", "George", "Ben");
        names
                .map(s->s.length())//equivalent String::length
                .forEach(System.out::print);
        //Creates one-to-one mapping from elements in source stream to a new stream

        System.out.println("\n");
        //mapping using flatMap()
        List<String> zero = List.of();
        List<String> one = List.of("John");
        List<String> two = List.of("George", "Ben");
        Stream<List<String>> namess = Stream.of(zero, one, two);
        namess.flatMap(m->m.stream()).forEach(System.out::print);//JohnGeorgeBen
            //argument of flatMap() is Function
        //removes the empty list, and changes all elements to be at the top level of the stream

        System.out.println("\n");
        //sorting
        names = Stream.of("John", "George", "Ben");
        names.sorted().forEach(System.out::print);//BenGeorgeJohn

        System.out.println("\n");
        //we can provide Comparator as a argument, e.g.
        names = Stream.of("John", "George", "Ben");
        names.sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::print);//BenJohnGeorge

        System.out.println("\n");
        //peek() very useful operation in debugging in Stream
        names = Stream.of("John", "George", "Ben");
        long count = names.filter(s->s.startsWith("G"))
                .count();
        System.out.println("count = " + count);

        System.out.println();
        //if we want to see what is going on in the pipeline
        names = Stream.of("John", "George", "Ben");
        count = names.filter(s->s.startsWith("G"))
                .peek(System.out::print)//argument of peek() is consumer
                .count();
        System.out.println("\ncount = " + count);






    }
}
