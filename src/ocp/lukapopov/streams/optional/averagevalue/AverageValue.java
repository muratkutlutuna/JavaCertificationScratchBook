package ocp.lukapopov.streams.optional.averagevalue;

import java.util.NoSuchElementException;
import java.util.Optional;

//Optional value can not be empty otherwise it gives nullPointerException
public class AverageValue {
    public static Optional<Double> average(int... myNumbers) {
        if (myNumbers.length == 0) {
            return Optional.empty();
        }// you can handle the posibility of the null value exception by covering with Optional.empty() method
        int sum = 0;
        for (int number : myNumbers) {
            sum += number;
        }
        return Optional.of((double) sum / myNumbers.length);
    }

    public static void main(String[] args) {
        System.out.println("average(23, 5, 5656, 34) = " + average(23, 5, 5656, 34));
        System.out.println("average() = " + average());


        System.out.println("""
                                \n\nSometimes we want to check 
                                if the Optional is empty 
                                with the myOptional.isPresent() method""");
        Optional<Double>myOptional = average(10,20,30);
        if (myOptional.isPresent()) {//first we check if myOptional contains value
            System.out.println("myOptional.get() = " + myOptional.get());//if so, get the value(=>20.0)
        }
        System.out.println("\nOtherwise we could get the exception");
        Optional<Double>myEmptyOptional=average();
        try{
        System.out.println("myEmptyOptional.get() = " + myEmptyOptional.get());}catch (NoSuchElementException e){
            System.out.println("""
                                    below code: 
                                    System.out.println("myEmptyOptional.get() = " + myEmptyOptional.get());
                                    returns NoSuchElementException""");
        }
    }
}
