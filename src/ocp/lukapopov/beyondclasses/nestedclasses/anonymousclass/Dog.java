package ocp.lukapopov.beyondclasses.nestedclasses.anonymousclass;


/**
 * @implNote Exam trick: "empty interface"
 */
public class Dog {
    interface Eats{}
//    Eats eating = new Eats {};
}

//eating is not an instance of the interface (not allowed!),
//but the instance of the anonymous class {}; implementing the interface
