package ocp.lukapopov.streams.primitivestreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingStreams {
    public static void main(String[] args) {
        System.out.println(
                """
                \n\n\n                    ***====Unique Primitive Streams Methods====***
                Source          To create:      To create:      To create:      To create:
                stream class    Stream          DoubleStream    IntStream       LongStream
                Stream<T>       map()           mapToDouble()   mapToInt()      mapToLong()
                DoubleStream    mapToObj()      map()           mapToInt()      mapToLong()
                IntStream       mapToObj()      mapToDouble()   map()           mapToLong()
                LongStream      mapToObj()      mapToDouble()   mapToInt()      map()
                """);

        //mapping example
        Stream<String> objStream = Stream.of("John", "Paul", "George", "Ringo");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::print);

        System.out.println("\n");
        //you can use flatMap() in the same way as before:
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1,2,3));
        listOfLists.add(Arrays.asList(4,5));
        listOfLists.add(Arrays.asList(6, 7, 8, 9));
        System.out.println("listOfLists = " + listOfLists);

        intStream = listOfLists.stream()
                .flatMapToInt(list -> list.stream().mapToInt(n -> n));
        intStream.forEach(System.out::print);

        System.out.println("\n");
        //primitive streams use optionals
        var myIntStream = IntStream.rangeClosed(2, 7);
        OptionalDouble myAvg = myIntStream.average();
        myAvg.ifPresent(System.out::println);//as with any other optional
        System.out.println("myAvg.getAsDouble() = " + myAvg.getAsDouble());//getAsDouble() instead of get()
        System.out.println("myAvg.orElseGet(()->Double.NaN) = " + myAvg.orElseGet(() -> Double.NaN));
                                                                //takes DoubleSupplier instead of Supplier

    }
}
