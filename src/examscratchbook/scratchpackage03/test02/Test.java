package examscratchbook.scratchpackage03.test02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test implements Interf{
    public void m1()
    {
        System.out.println("Test class method");
    }
    public static void main(String[] args)
    {
        Interf i = new Test();
        i.m1();
    }
}
interface Interf
{
    default void m1()
    {
        System.out.println("interface default method");
    }
}
//protected class PrivateClass{}

class CharToIntOrShort{
    public static void m1(short x)
    {
        System.out.println("short argument");
    }
    public static void m1(int x)
    {
        System.out.println("int argument");
    }

    public static void m1(double x)
    {
        System.out.println("double argument");
    }
    public static void main(String[] args)
    {
        char ch = 'j';
        m1(ch);
//        new Pattern();
    }
}

interface I01{}
interface I02{}
interface I04{}
interface I05{}
interface I03 extends I01,I02,I04,I05{}
class Cl01 extends Cl02 {}
class Cl02{}
class Cl03{}
class Cl04{}

class TestException extends Exception{}
class ExceptionTrying{
    public static void m1() throws TestException,Error,RuntimeException
    {
        System.out.print("A");
        throw new TestException();
    }
    public static void main(String[] args)
    {
        try
        {
            m1();
        }
        catch (TestException e)
        {
            System.out.println("B");
        }
        finally
        {
            System.out.println("C");
        }

    }
}

class ReturningFinally{
    public static int m1()
    {
        try
        {
            return 1;
        }
        catch (ArithmeticException e)
        {
            return 2;
        }

    }

    public static void main(String[] args)
    {
        System.out.print(m1());
        String s = new String("Bahubali");
        StringBuilder sb = new StringBuilder("Bahubali");
//        System.out.println(s==sb);
        System.out.println(s.equals(sb));
        ArrayList<Double> doubles = new ArrayList<>();
        List<String> l = Arrays.asList("Cat","Dog");
        for(String s1 : l)
        {
            for (String s2: l  )
            {
                System.out.println(s1+"..."+s2);
            }
        }
//        Predicate<Integer> p1=(int i)->i>10;
        Predicate<Integer> p2=i->i>10;
//        Predicate<Integer> p3=(int i)->{i>10};
        Predicate<Integer> p4=(i)->i>10;
        Predicate<Integer> p5=(i)->{return i>10;};
        StringBuilder sbb = new StringBuilder("Java8");
        sbb.reverse().deleteCharAt(0).append("SE").delete(3,sbb.length());
        System.out.println(sbb);
    }
}

interface Rideable {
    void ride(String name);
}

class Animal {}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
    public void drive(){
        System.out.println("hey");
    }
}

class Test01 {
    public static void main(String[] args) {
        Animal horse = new Horse();
//        (Horse)horse.ride("Emma");
//        (Horse)(Rideable)horse.ride("Emma");
//        (Rideable)horse.ride("Emma");
        ((Horse)horse).ride("Emma");
        ((Rideable)horse).ride("Emma");
        ((Horse)(Rideable)horse).ride("Emma");
//        (Rideable)(Horse)horse.ride("Emma");
//        horse.ride();// Parent data type of object can not use childs methods
        ((Rideable)(Horse)horse).ride("Emma");

        /*INSERT*/
    }
}