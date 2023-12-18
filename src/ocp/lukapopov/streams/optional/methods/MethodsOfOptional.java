package ocp.lukapopov.streams.optional.methods;

import ocp.lukapopov.streams.optional.averagevalue.AverageValue;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

public class MethodsOfOptional extends AverageValue {
    public static void main(String[] args) throws IllegalStateException {
        Optional<Double> myOptional = average();
        System.out.println(myOptional.orElse(Double.NaN));
        System.out.println("myOptional.orElseGet(()->Math.random()) = " +
                myOptional.orElseGet(() -> Math.random()));//the supplier must provide double!!

        try {
            System.out.println("myOptional.orElseThrow() = " + myOptional.orElseThrow());
        } catch (Exception e) {
            System.out.println("myOptional.orElseThrow() = "+e);
        }
        try {
            System.out.println("myOptional.orElseThrow(IllegalStateException::new) = " +
                    myOptional.orElseThrow(IllegalStateException::new));
        } catch (IllegalStateException e) {
            System.out.println("myOptional.orElseThrow(IllegalStateException::new) = "+e);
        }
        try {
            System.out.println("myOptional.orElseThrow(()->new IllegalStateException()) = " +
                    myOptional.orElseThrow(() -> new IllegalStateException()));
        } catch (IllegalStateException e) {
            System.out.println("myOptional.orElseThrow(()->new IllegalStateException()) = "+e);
        }
        try {
            System.out.println("myOptional.orElseThrow(() -> {throw new IllegalStateException();}) = " +
                    myOptional.orElseThrow(() -> {throw new IllegalStateException();}));
        } catch (RuntimeException e) {
            System.out.println("myOptional.orElseThrow(() -> {throw new IllegalStateException();}) = "+e);
        }
        try {
            System.out.println("myOptional.orElseThrow(() -> {return new IllegalStateException();}) = " +
                    myOptional.orElseThrow(() -> {return new IllegalStateException();}));
        } catch (IllegalStateException e) {
            System.out.println("myOptional.orElseThrow(() -> {return new IllegalStateException();}) = "+e);
        }

        System.out.println("\nif myOptional wasn't empty, the value will be returned in all cases");




    }
}


