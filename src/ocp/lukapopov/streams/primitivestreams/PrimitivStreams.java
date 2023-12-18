package ocp.lukapopov.streams.primitivestreams;


import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * IntStream - used for int, short, byte, char
 * LongStream - long
 * DoubleStream - double and float
 * 1-) everything applies for primitve streams as well
 * 2-) only difference is that primitive streams have some unique methods
 */
public class PrimitivStreams {
    public static void main(String[] args) {
        System.out.println(
        """
        \n\n\n                    ***====Unique Primitive Streams Methods====***
        Method                              Primitive stream                        What it does
        OptionalDouble average()            IntStream, LongStream, DoubleStream     Arithmetic mean of elements
        Stream<T> boxed()                   IntStream, LongStream, DoubleStream     Stream<T> where T is wrapper class
                                                                                    associated with primitive value
        OptionalInt max()                   IntStream                               Maximum element of the stream
        OptionalLong max()                  LongStream                              Maximum element of the stream
        OptionalDouble max()                DoubleStream                            Maximum element of the stream
        OptionalInt min()                   IntStream                               Minimum element of the stream
        OptionalLong min()                  LongStream                              Minimum element of the stream
        OptionalDouble min()                DoubleStream                            Minimum element of the stream
        IntStream range(int a, int b)       IntStream                               Returns IntStream from 
                                                                                    a (inclusive) to b (exclusive)
        LongStream range(long a, long b)    LongStream                              Returns LongStream from 
                                                                                    a (inclusive) to b (exclusive)
        
        IntStream rangeClosed(int a, int b)       IntStream                               Returns IntStream from 
                                                                                    a (inclusive) to b (inclusive)
        LongStream rangeClosed(long a, long b)    LongStream                              Returns LongStream from 
                                                                                    a (inclusive) to b (inclusive)   
        int sum()                                   IntStream                       Returns sum of elements in stream                                                                         
        long sum()                                  LongStream                      Returns sum of elements in stream                                                                         
        double sum()                                DoubleStream                    Returns sum of elements in stream
        IntSummaryStatistics summaryStatistics()    IntStream                       Returns objects containing numerous
                                                                                    stream statistics (avg, min, max etc.)    
        LongSummaryStatistics summaryStatistics()   LongStream                      Returns objects containing numerous
                                                                                    stream statistics (avg, min, max etc.)    
        DoubleSummaryStatistics summaryStatistics() DoubleStream                    Returns objects containing numerous
                                                                                    stream statistics (avg, min, max etc.)                                                                         
                                                                                                
                                                                           
        """);


        //example #1
        IntStream intStream = IntStream.of(7, 11, 21);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());


        System.out.println("\n");
        //example 2#
        DoubleStream doubleStream = DoubleStream.of(3.14, 2.72, 1.618);
        doubleStream.forEach(System.out::println);

        System.out.println("\n");
        //example 3#
        intStream = IntStream.range(2, 5);
        intStream.forEach(System.out::print);

        System.out.println("\n");
        //example 4#
        intStream = IntStream.rangeClosed(2, 5);
        intStream.forEach(System.out::print);

        System.out.println("\n");
        //my example 1#
        intStream = IntStream.of(7, 11, 21);
        IntSummaryStatistics summaryStatistics = intStream.summaryStatistics();
        System.out.println(summaryStatistics);



    }
}
