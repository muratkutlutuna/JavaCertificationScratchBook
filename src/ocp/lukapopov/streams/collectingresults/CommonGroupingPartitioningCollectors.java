package ocp.lukapopov.streams.collectingresults;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonGroupingPartitioningCollectors {
    public static void main(String[] args) {
        System.out.println(
                """
                \n\n\n           ***====Common Grouping/Partitioning Collectors====***
                Collector                   Description                             Return value(w/collect)
                averagingDouble(            Calculates average for doubles          Double
                    ToDoubleFunction f)         
                averagingInt(               Calculates average for integers         Double
                    ToIntFunction f)            
                averagingLong(              Calculates average for longs            Double
                    ToLongFunction f)           
                counting()                  Counts numbers of elements              Long
                filtering(Predicate p,      Applies flter before calling            R
                    Collector c)            downstream collector
                groupingBy(Function f)      Creates map                             Map<K, List<T>>
                groupingBy(Function f),     Creates map where downstream            Map<K, List<T>> 
                    Collector dc)           collector is provided 
                groupingBy(Function f),     Creates map where both map supplier     Map<K, List<T>> 
                    Supplier s,             and downstream collector are provided
                    Collector dc)    
                joining(CharSequence cs)    Creates String using cs as delimiter    String
                maxBy(Comparator c)         Finds largest/smallest elements         Optional<T>
                minBy(Comparator c)
                mapping(Function f,         Adds another level of collectors        Collector
                    Collector sd)
                PartitioningBy(             Creates map grouping                    Map<Boolean, List<T>>
                    Predicate p)
                partitioningBy(             Creates map grouping                    Map<Boolean, List<T>>
                    predicate p,
                    Collector dc)
                """);


        //joining() example
        var names = Stream.of("John", "George", "Luke");
        String result = names.collect(Collectors.joining("-"));
        System.out.println("result = " + result);//static Collectors method is passed as an argument in collect()

        //averaging() example
        names = Stream.of("John", "George", "Luke");
        Double resultD = names.collect(Collectors.averagingInt(String::length));
        System.out.println("resultD = " + resultD);

        //toCollection() example
        names = Stream.of("John", "George", "Luke", "Joe");
        TreeSet<String> resultTS = names
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("resultTS = " + resultTS);

        //toMap() example #1
        names = Stream.of("John", "George", "Luke");
        Map<String, Integer> resultM = names.collect(Collectors.toMap(s->s,String::length));
        System.out.println("resultM = " + resultM);

        //toMap() example #2
        names = Stream.of("John", "George", "Luke");
//        Map<Integer, String> resultM2 = names.collect(Collectors.toMap(String::length, k -> k));
                                                                    //       key        value
        //IllegalStateException: Duplicate key 4 (attempted merging values John and Luke)
        //to solve this we have to provide a merge rule, e.g.
        Map<Integer, String> resultM2 = names.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + ";" + s2//merge rule given by BinaryOperator
        ));
        System.out.println("resultM2 = " + resultM2);//


        //if we don't specify the class, toMap can return any class
        //which implements Map interface (usually HashMap, but not guaranteed)
        //...or we can specify the class:
        var names2 = Stream.of("John", "George", "Luke");
        Map<Integer, String> rslt = names2.collect(Collectors.toMap(
                        String::length,
                        x->x,//Function.identity(),
                        (s1, s2) -> s1 + ";" + s2,
                    TreeMap::new));
        System.out.println(rslt);
        System.out.println(rslt.getClass());

        //groupingBy() example #1
        names = Stream.of("John", "George", "Luke");
        Map<Integer, List<String>> resultList = names.collect(Collectors.groupingBy(String::length));
                                                                                    //argument is Function
        System.out.println("resultList = " + resultList);
        System.out.println("resultList.getClass() = " + resultList.getClass());

        //groupingBy() example #2
        names = Stream.of("John", "George", "Luke");
        Map<Integer, Set<String>> resultSet = names.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()//downstream collector ensures that the value will be Set
                )
        );
        System.out.println("resultSet = " + resultSet);
        System.out.println("resultSet.getClass() = " + resultSet.getClass());

        //groupingBy() example 3# (using map supplier and downstream collector)
        names = Stream.of("John", "George", "Luke");
        TreeMap<Integer, Set<String>> resultTreeMap = names.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,//map supplier ensures that the Map implementation will be TreeMap
                        Collectors.toSet()//downstream collector ensures that the value will be Set
                )
        );
        System.out.println("resultTreeMap = " + resultTreeMap);
        System.out.println("resultTreeMap.getClass() = " + resultTreeMap.getClass());

        //partitioningBy() has only two groups: true and false
        names = Stream.of("John", "George", "Luke");
        Map<Boolean, List<String>> resultPartitioningByList = names.collect(
                Collectors.partitioningBy(s -> s.length() <= 4)
        );
        System.out.println("resultPartitioningByList = " + resultPartitioningByList);

        //partitioningBy() with Set instead of List
        names = Stream.of("John", "George", "Luke");
        Map<Boolean, Set<String>> resultPartitioningBySet = names.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 4,
                        Collectors.toSet()//we have provided downstream collector
                )
        );
        System.out.println("resultPartitioningBySet = " + resultPartitioningBySet);

        //teeing() is used for returning multiple values e.g. sum and average
        //step 1: create a type which stores values:
        record MyData(int sum, double avg){}
        //step 2: use stream to return the result of the type MyData
        var numbers = Stream.of(1, 2, 3, 4, 5);
        MyData resultMyData = numbers.collect(
                Collectors.teeing(
                        Collectors.summingInt(i -> i),//first collector
                        Collectors.averagingDouble(i -> i),//second collector
                        MyData::new//merging function
                )
        );
        System.out.println("resultMyData = " + resultMyData);
        System.out.println("resultMyData.getClass() = " + resultMyData.getClass());





    }
}
