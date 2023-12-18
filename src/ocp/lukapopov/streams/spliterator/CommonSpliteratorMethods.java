package ocp.lukapopov.streams.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class CommonSpliteratorMethods {
    public static void main(String[] args) {
        System.out.println(
                """
                \n\n\n                  ***====Common Spliterator Methods====***
                Method                                  What id does
                Spliteratir<T> trySplit()               Returns Spliterator containing about half of the data, 
                                                        which is then removed from the original Spliterator
                                                        (if data is no longer splittable it returns null)
                void forEachRemaining(Consumer<T> c)    Processes remaining elements in Spliterator  
                boolean tryAdvance(Consumer<T> c)       Processes single element from Spliterator (if exits),
                                                        returns if the element is processed                                      
                """);
        System.out.println("\n");
        //example 1#
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
        Stream<String> stream = list.stream();
        Spliterator<String> originalSpliterator = stream.spliterator();
        Spliterator<String> newSpliterator = originalSpliterator.trySplit();
        newSpliterator.forEachRemaining(System.out::println);
        System.out.println("---");
        originalSpliterator.forEachRemaining(System.out::println);
        /**
         * Once you apply forEachRemaining() method on a Spliterator,
         *      all elements are processed and Spliterator is now empty,
         *      so if you run this command again:
         *      originalSpliterator.forEachRemaining(System.out::println); it will return nothing
         */
        System.out.println("\n\n");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Spliterator<Integer> spliterator1 = numbers.stream().spliterator();
        Spliterator<Integer> spliterator2 = spliterator1.trySplit();
        spliterator1.tryAdvance(System.out::println);
        System.out.println("---");
        spliterator1.forEachRemaining(System.out::println);
        System.out.println("---");
        spliterator2.tryAdvance(System.out::println);
        System.out.println("---");
        spliterator2.forEachRemaining(System.out::println);

    }
}
