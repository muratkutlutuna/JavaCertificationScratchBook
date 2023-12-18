package ocp.lukapopov.streams.optional.averagevalue;

import java.util.Optional;

public class HandlingNullValueOptional extends AverageValue{
    public static void main(String[] args) {
        //good practise is to use empty() when value is null
        String value=null;
        Optional myOptional = (value==null)?Optional.empty():Optional.of(value);

        //there is a factory method which takes care of this
        Optional myNullableOptional = Optional.ofNullable(value); //if the value is null, Optional.empty is returned

        //run the method if optional is not empty
        Optional<Double>myOpt=average(10,20,30);
        myOpt.ifPresent(System.out::println);//prints the value if the value is present, otherwise does nothing
    }
}
    /**
     *
     */



