package examscratchbook.scratchpackage03;

import javax.lang.model.element.Name;
import java.io.FileNotFoundException;
import java.io.IOException;

class Shape {
    int side = 0; //Line n1

     int getSide() { //Line n2
        return side;
    }
}

class Square extends Shape {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s = new Square();
        System.out.println(s.side + ":" + s.getSide());

        if (true) {
            System.out.println("3");
        } else if (false) {

            System.out.println("$#4");
        }


    }
}

interface ILogger {
    void log();
}

class Test2 {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
        for(ILogger logger : loggers)
            logger.log(); //Line n2
    }
}



class X {
    void A() {
        System.out.print("A");
    }
}

class Y extends X {
    void A() {
        System.out.print("A-");
    }

    void B() {
        System.out.print("B-");
    }

    void C() {
        System.out.print("C-");
    }
}

class Test3 {
    public static void main(String[] args) {
        X obj = new Y(); //Line n1
        obj.A(); //Line n2
//        obj.B(); //Line n3
//        obj.C(); //Line n4
    }
}

class Base {
    int id = 1000; //Line n1

    Base() {
        Base(); //Line n2
    }

    void Base() { //Line n3
        System.out.println(++id); //Line n4
    }
}

class Derived extends Base {
    int id = 2000; //Line n5

    Derived() {} //Line n6

    void Base() { //Line n7
        System.out.println(--id); //Line n8
    }
}

class Test4 {
    public static void main(String[] args) {
        Base base = new Derived(); //Line n9

        String str = "3245";
//        str.indexOf("2", 4, 5);

        int ctr = 100;
        one: for (int i = 0; i < 10; i++) {
            two: for (int j = 0; j < 7; j++) {
                three: while (true) {
                    ctr++;
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
}

interface Perishable1 {
    int i = 3;

    default int maxDays() {
        return 1;
    }
}

interface Perishable2 extends Perishable1 {
    int j = 4;
    default int maxDays() {
        return 2;
    }
}

class Milk implements Perishable2, Perishable1 {}

class Test5 {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        System.out.println(obj.maxDays() + " : " + obj.i);
    }
}

class Test6 {
    private static void div(int i, int j) {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw (new RuntimeException(e));
        }
    }

    public static final void main(int[] args) {}
    public static final void main(Object[] args) {}
      public static final void main(String[] args) {
        try {
            div(5, 0);
        } catch(ArithmeticException e) {
            System.out.println("AE");
        } catch(RuntimeException e) {
            System.out.println("RE");
        }
        int []arr = new int[3];
        arr[0] ='a';
//        char ch2 =-10;
        float f = (float)10.5;
//        int [] h = new short[3];
        Object [] o = new String[3];
//        System.out.println(arr[0]+ch2);
        int i = 0;
        Boolean b1 = Boolean.valueOf(null);
        System.out.println("b1 = " + b1);
          {
              System.out.println("block");
          }
//        Boolean b12 = new Boolean(null);//legacy
        Boolean b2 = Boolean.valueOf(false);
        System.out.println("b2 = " + b2);
        System.out.print((b1 == b2)+" ");
        System.out.print(b1.equals(b2));

        switch (i) {
//            case i+10 -> System.out.println(i);
            default -> System.out.println("234");
        }


          switch (i + 1) {
              case 10:
                  System.out.println(10);
              case 100:
                  System.out.println(100);
          }
    }
}

class App{
    String myStr = "9009";

    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch(NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: "+myStr+", myNum: "+myNum);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("7007");
    }
}
interface IDatabase{
    static final int i=1;
     Object log()throws IOException;
    public static  void m1()
    {
        System.out.println("IDatabase m1");
    }
    public default void m2(){
        System.out.println("IDatabase m2");
    }
   abstract void delete();
    void add();
    void patch();
//    IDatabase(String str){}

}
abstract class Abstraction implements IDatabase{
    int x;
//    public void met();
//    public abstract void m3();
    public static  void m1()
    {
        System.out.println("Abstraction m1");
    }
    public void add(){};

    abstract public void patch();
    public void m2(){
        System.out.println("Abstraction m2");
    }
    Abstraction(){}
}
class Trying extends Abstraction{;;;
;;;;;
    @Override
    public Object log() throws IOException {
        return null;
    }
    public static  void m1()
    {
        System.out.println("Trying m1");
    };;;
    public void m2 (){;;
        System.out.println("Trying m2");;
    }

    public static void main(String[] args) {
        IDatabase t1 = new Trying();;
        t1.m2();
        Abstraction t2 = new Trying();;;;
        t2.m2();;
        Trying t3 = new Trying();
        m1();
//        t1.m1();//Static method may be invoked on containing interface class only
//        t2.m1();//Static member 'examscratchbook.scratchpackage03.Abstraction.m1()' accessed via instance reference
//        t3.m1();//Static member 'examscratchbook.scratchpackage03.Trying.m1()' accessed via instance reference
//        m2();//Non-static method 'm2()' cannot be referenced from a static context
        t1.m2();;
        t2.m2();
        t3.m2();;
//        Trying.this.m2();;;;

        IDatabase.m1();
        Abstraction.m1();
        Trying.m1();
        t3.method();

    }
    public void method(){
        ;;

        Trying.super.m2();;
//        IDatabase.this.m2();
//        Abstraction.this.m2();;
        Trying.this.m2();
        ;;;
    };;

    @Override
    public void delete() {;;;

    }
    @Override
    public void add(){;;
        System.out.println("23");;;;;
    }

    @Override
    public void patch() {
        System.out.println("1");
    }


};;;
class InterfTest2 {
    public static void main(String[] args) {
        IDatabase I = new IDatabase() {
            @Override
            public Object log() throws IOException {
                return null;
            }

            @Override
            public void delete() {

            }

            @Override
            public void add() {

            }

            @Override
            public void patch() {

            }
        };
        I.m2();
        CharSequence cs = new Name() {
            @Override
            public boolean contentEquals(CharSequence cs) {
                return false;
            }

            @Override
            public int length() {
                return 6;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }
        };
        String str = new String("4534sgg");
    }
}
class ReturnType {
//    public void m1()
//    {
//        System.out.println("void return type method");
//    }
//    public static int m1()
//    {
//        System.out.println("int return type method");
//        return 10;
//    }
    public static void main(String[] args)
    {
//        new Test().m1();
    }
}
class InterfTest implements IDatabase{
    public String log() throws FileNotFoundException{return null;}

    @Override
    public void delete() {

    }

    @Override
    public void add() {

    }

    @Override
    public void patch() {

    }

    public static void main(String[] args) {
        IDatabase.m1();
//        IDatabase.m2();
        IDatabase I = new IDatabase() {
            @Override
            public Object log() throws IOException {
                return null;
            }

            @Override
            public void delete() {

            }

            @Override
            public void add() {

            }

            @Override
            public void patch() {

            }
        };
        I.m2();
//        I.m1();
//        i=3;
        System.out.println(i);
    }
}


class Parent
{
    int i = 4;

    public static void m1()
    {
        System.out.println("Parent Method");
    }
}
class Child extends Parent
{
    int i = 3;
    public static void m1()
    {
        System.out.println("Child Method");
    }
}
 class Test7
{
    public static void main(String[] args)
    {
        Parent c = new Child();
        ((Parent)c).m1();
        System.out.println(((Parent)c).i);
    }
}

class WhichOne{
    public static void m1(int x)
    {
        System.out.print("int");
    }
    public static void m1(long l)
    {
        System.out.print("long");
    }
    public static void m1(float f)
    {
        System.out.print("float");
    }
    public static void m1(Object o)
    {
        System.out.print("Object");
    }
    public static void main(String[] args)
    {
        m1('a');
        m1(true);
        m1(10.5);
    }
}
