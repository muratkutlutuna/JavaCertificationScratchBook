package literalOctals;

public class WrapperClasses {

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        Integer myInteger2 = 20;
        long t2 = System.nanoTime();

        Integer myInteger3 = Integer.valueOf(10);
        long t3 = System.nanoTime();

        Integer myInteger4 = Integer.parseInt("3");
        long t4 = System.nanoTime();

        Integer myInteger5 = null;
        long t5 = System.nanoTime();

        System.out.println("myInteger2 = " + myInteger2);
        System.out.println(t2-t1);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println(t3-t2);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println(t4-t3);
        System.out.println("myInteger5 = " + myInteger5);
        System.out.println(t5-t4);

        short b = 2;
//        int a =  7.3;
//        b.length();
//        a.length();


    }

    //java benefits
    //--OOP == Classes and Objects
    //--Encapsulation == access modifier
    //--Platform Independent == compile byte code, write once run anywhere
    //--Robust == over C++ major advantage, garbage collection, handling memory leaks
    //--Simple
    //--Secure

}
