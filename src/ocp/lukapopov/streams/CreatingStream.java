package ocp.lukapopov.streams;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        System.out.println(
                """
                \n\n\n                        ***====Stream Creation Methods====***
                Method                                Finite    Description
                Stream.empty()                          Yes     Creates Stream with zero elements
                Stream.of(varargs                       Yes     Creates Stream with elements listed in varargs
                collection.stream()                     Yes     Creates Stream from Collection
                collection.parallelStream()             Yes     Creates parallel Stream from collection
                                                                    intermediate methods executes parallel
                                                                    it costs you process usage and saves time
                                                                    but you don't know which methods executes first
                Stream.generate(Supplier))              No      Creates Stream by calling Supplier for each element
                                                                    upon request. Supplier function uses get() 
                                                                    method, returns with function specified value
                Stream.iterate(seed, unaryOperator)     No      Creates Stream by using seed for first element and 
                                                                    then calls UnaryOperator for each subsequent element
                                                                    Unary elements like: !b"logical", ~a"bitwise", +a, -a,
                                                                    ++a, a++, --a, a--, (int)a"Cast" 
                Stream.iterate(seed, predicate,       Depends   Same as before, but stops if predicate returns false 
                                unaryOperator) """);


        //creating finite streams
        Stream<String> empty=Stream.empty();
        System.out.println("\n\nempty = " + empty);
        Stream<Integer>singleElement = Stream.of(1);
        System.out.println("singleElement = " + singleElement);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        System.out.println("fromArray = " + fromArray);

        //converting collection to stream
        var list = List.of("a","b","c");
        Stream<String>fromList = list.stream();

        //parallel stream (operations are done in parallel rather then in sequence)
        Stream<String>fromListParallel = list.parallelStream();



        //creating infinite streams
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        //these streams are infinite, they generate values ad infinitum
//        randoms.forEach(System.out::println);
        //program prints random numbers until you kill it

        //operations like limit() can turn infinite stream to finite one

        //create odd numbers less than 50
        Stream<Integer>oddNumbersUnder50=Stream.iterate(1,n->n<50,n->n+2);//seed, predicate, unary operator
        oddNumbersUnder50.forEach(System.out::print);
    }
}
