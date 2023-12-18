package ocp.lukapopov.streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminatingStream {
    public static void main(String[] args) {
        System.out.println("""
                                
                                      ***====Terminal Stream Operations====***
                Method          When applied on infinite stream     Return value        Reduction(all of the contents 
                                                                                    of the stream are combined into a 
                                                                                    single primitive or Objects)    
                count()         Does not terminate                  long                Yes
                min(), max()    Does not terminate                  Optional<T>         Yes
                FindAny()
                FindFirs()      Terminates                          Optional<T>         No
                allMatch()
                anyMatch()
                nonMatch()      Sometimes terminates                boolean             No
                forEach()       Does not terminate                  void                No
                reduce()        Does not terminate                  varies              Yes
                collect()       Does not terminate                  varies              Yes 
                """);

        //counting
        Stream<String> names = Stream.of("John", "George", "Ben");
        System.out.println("names.count() = " + names.count());//terminates the stream and returns long value

        //for the infinite stream, count() never terminates

        //finding minimum and maximum
        names = Stream.of("John", "George", "Ben");
        Optional<String> min = names.min((s1, s2) -> s1.length() - s2.length());//return type is Optional,
                                                                                // method argument is Comparator
        min.ifPresent(System.out::println);

        //using with empty stream
        Optional<?>minEmpty = Stream.empty().min((s1,s2)->0);
        System.out.println("minEmpty.isPresent() = " + minEmpty.isPresent());

        //these methods hang if applied to infinite stream

        //finding a value
        names = Stream.of("John", "George", "Ben");
        Stream<String> inf = Stream.generate(() -> "Luke");
        names.findAny().ifPresent(System.out::println);//returns optional
        //Johm(usually the first one)
        inf.findAny().ifPresent(System.out::println);//terminates infinite stream

        //findFirst() always returns the first element


        //matching
        var myList = List.of("George", "21", "Ben");
        inf = Stream.generate(() -> "Luke");
        Predicate<String> p = s -> Character.isLetter(s.charAt(0));//checks if the name begins with a letter
        System.out.println(myList.stream().anyMatch(p));//true
        System.out.println(myList.stream().allMatch(p));//false
        System.out.println(myList.stream().noneMatch(p));//false
        System.out.println(inf.anyMatch(p));//true, matching methods terminate infinite streams


        //iterating
        names = Stream.of("John", "George", "Ben");
        names.forEach(System.out::print);
        //NOTE: you can not use traditional for loop on the stream!
        Stream<Integer> s = Stream.of(1, 2, 3);
//        for (Integer i : s) {//does not compile
            //do something
//            System.out.println("traditional for each loop");
//        }
        //forEach() is not really a loop, but rather a terminal operator for streams
        System.out.println();


        //reducing
        //usually starts with initial value and merge to the next value:
        var myArray = new String[]{"L", "u", "k", "e"};
        var result = "";//initial value called identity
        for (var ss : myArray)result=result+ss;//accumulator
        System.out.println("result = " + result);

        //same thing using streams
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
//        String myName = myStream.reduce("",String::concat);
        String myName = myStream.reduce("",(str,c)->str+c);
//        String myName = myStream.reduce("",(String str,String c)->str+c);
                                          //identity   accumulator, passed as BinaryOperator
        System.out.println("myName = " + myName);

        //another way
        Stream<Integer> stream = Stream.of(3, 7, 10);
        System.out.println("\nStream<Integer> stream = Stream.of(3, 7, 10)");
        System.out.println("stream.reduce(1,(a,b)->a*b) = " + stream.reduce(1, (a, b) -> a * b));

        //if you omit the identity, Optional will be returned
        BinaryOperator<Integer>op = (a,b)->a*b;
        Stream<Integer>empty = Stream.empty();
        Stream<Integer>oneElement = Stream.of(7);
        Stream<Integer> threeElements = Stream.of(3, 7, 10);

        empty.reduce(op).ifPresent(System.out::println);//no output
           //returns Optional
        oneElement.reduce(op).ifPresent(System.out::println);//7
        threeElements.reduce(op).ifPresent(System.out::println);//210


        //when dealing with different types
        names=Stream.of("John", "George", "Ben");
        int len = names.reduce(0,(i,j)->i+j.length(),(a,b)->a+b);
                             //initializer,    accumulator,     combiner
        System.out.println(len);


        //collecting (mutable reduction)
        myStream = Stream.of("L", "u", "k", "e");
        StringBuilder myNamesb = myStream.collect(
                StringBuilder::new,//supplier, creates the object that will store the results as we collect data
                StringBuilder::append,//accumulator, passed as BiConsumer
                StringBuilder::append);//combiner, passed as BiConsumer
        System.out.println("myNamesb = " + myNamesb);
        //if this was a parallel stream, the order would be unpredictable


        //keeping the order in the collection (sorted)
        myStream = Stream.of("L", "u", "k", "e");
        TreeSet<String> mySet = myStream.collect(
                TreeSet::new,//supplier, creates an empty TreeSet
                TreeSet::add,//accumulator, adds a single String from Stream to TreeSet
                TreeSet::addAll);//combiner, adds all elements of one TreeSet to another
        System.out.println("\n\n"+mySet);
        //[L, e, k, u] (TreeSet automatically sorts the elements in ascending order)

        //using Collectors class
        myStream = Stream.of("L","u","k","e");
        mySet = myStream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println("\n"+mySet);                     //supplier
        //[L, e, k, u]//sorted in ascending order

        //if we don't care about the order
        myStream = Stream.of("L","u","k","e");
        Set<String>mySet2=myStream.collect(Collectors.toSet());
                                            //you don't know which implementation
                                            // of Set you will get
                                            // (most likely HashSet)
        System.out.println("\n"+mySet2);//[u, e, k, L] order is unpredictable






    }
}
