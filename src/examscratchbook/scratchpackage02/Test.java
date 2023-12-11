package examscratchbook.scratchpackage02;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");

        List<String> subList = list.subList(1, 2); //Line n1
        subList.set(0, "E"); //Line n2
        System.out.println(list);
        try {
            try {
                System.out.println(args[1]); //Line n1
            } catch(RuntimeException e) {
                System.out.print("1INHALE-"); //Line n2
                throw e; //Line n3
            } finally {
                System.out.print("2EXHALE-"); //Line n4
            }
        } catch(RuntimeException e) {
            System.out.print("3INHALE-"); //Line n5
        } finally {
            System.out.print("4EXHALE"); //Line n6
        }

        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 && flag2);

        List<StringBuilder> liste = new ArrayList<>();
        liste.add(new StringBuilder("AAA")); //Line n1
        liste.add(new StringBuilder("BBB")); //Line n2
        liste.add(new StringBuilder("AAA")); //Line n3

        liste.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4
        System.out.println(liste);
    }
}
class JavacJava {
    public static void main(String[] args) {
        System.out.println("JavacJava classi calisti");
    }
}
class Test1 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e.printStackTrace();
            e=null;
//            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            e.printStackTrace();

            System.out.println("CAUGHT SUCCESSFULLY");
        }
    }
}

interface Counter {
    int count = 10; //Line n1
}


class Test3 {
    public static void main(String[] args) {
//        Counter c = new Counter();
        Counter [] arr = new Counter[2]; //Line n2
        for(Counter ctr : arr) {
            System.out.print(ctr.count); //Line n3

            //what is the difference between constant and non-constant variables.
            final int i4 = 40000;
//            short s4 = i4;

            int i7 = 10;
//            short s7 = i7;

            final int m = 25000;
            final int n = 25000;
//            short s6 = m+n;

            final int i5 = 10;
            short s5 = i5+100;


        }
    }
}
class main {
    static String main = "ONE";

     public  main() {
        System.out.println("TWO");
    }

    public static void main(String [] args) {
        main();
    }

    public static void main() {
        System.out.println(main);
    }
}

interface Profitable {
    double profitPercentage = 42.0;
}

class Business implements Profitable {
    double profitPercentage = 50.0; //Line n1
}

class Test4 {
    public static void main(String[] args) {
        Profitable obj = new Business(); //Line n2
        System.out.println(obj.profitPercentage); //Line n3
    }
}

abstract class Traveller {
    void travel(String place){}
}

abstract class BeachTraveller extends Traveller {
    /*INSERT*/
//     void travel (String place)throws java.io.IOException{};
}

class Lock {
    public void open() {
        System.out.println("LOCK-OPEN");
    }
}

class Padlock extends Lock {
    public void open() {
        System.out.println("PADLOCK-OPEN");
    }
}

class DigitalPadlock extends Padlock {
    public void open() {
//        ((Lock)super).open();
//        (Lock)super.open();
//        super.super.open();

    }
}

class Test5 {
    public static void main(String[] args) {
        Lock lock = new DigitalPadlock();
        lock.open();
    }
}


interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
//    public static void log() {//log() in examscratchbook.scratchpackage02.Log
//                              // cannot implement log() in
//                              // examscratchbook.scratchpackage02.ILog
//                              //overriding method is static
//        System.out.println("Log");
//    }
}

class MyLogger extends Log implements ILog {}


class Square {
    int length;
    Square sq;

    Square(int length) {
        this.length = length;
    }

    void setInner(Square sq) {
        this.sq = sq;
    }

    int getLength() {
        return this.length;
    }
}

class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4
    }
}


class M {
    public void printName() {
        System.out.println("M");
    }
}


class N extends M {
    @Override
    public void printName() {
        System.out.println("N");
    }
}

class Test6 {
    public static void main(String[] args) {
        M obj1 = new M();
//        N obj2 = (N)obj1;
//        obj2.printName();
        new Base();
//        Profit.super().profit();
    }
}
class Super{
    void Super(){
        System.out.println("1");
    }
}
class Base extends Super{
    Base(){
        super();
        Super();
        System.out.println("3");
    }
}

interface Profitable1 {
    default double profit() {
        return 12.5;
    }
}



interface Profitable2 {
    default double profit() {
        return 25.5;
    }
}
abstract class Parent{
    double profit (){
        return 3.3;
    }
}

abstract class Profit extends Parent implements Profitable1, Profitable2 {
    public double profit(){

//        Profitable2.profit();
        return Profitable1.super.profit();//***** when the method default in interface is
    }
}







