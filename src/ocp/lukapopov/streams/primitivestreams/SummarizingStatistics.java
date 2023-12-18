package ocp.lukapopov.streams.primitivestreams;


import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * summaryStatistics()
 * - getCount() => (long)
 * - getAverage() => (double) or 0 if the stream is empty
 * - getSum() => (double or long)
 * - getMin() => (double, int or long)
 * ---  if the stream is empty returns the largest numeric value based on the type
 * - getMax() => (double, in or long)
 * ---  if the stream is empty returns the smallest numeric value based on the type
 */
public class SummarizingStatistics {
    public static void main(String[] args) {

        //example using summarizing statistics
        var intStream = IntStream.of(7, 2, -4, 11, 27);
        IntSummaryStatistics stats = intStream.summaryStatistics();
        System.out.println("stats.getCount() = " + stats.getCount());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getMax() = " + stats.getMax());
    }
}
