package examscratchbook.scratchpackage01;

import java.io.IOException;
import java.sql.SQLException;

public class Test01 {
}
class X {
    void greet() {
        System.out.println("Good Morning!");
    }
}

class Y extends X {
    void greet() {
        System.out.println("Good Afternoon!");
    }
}

class Z extends Y {
    void greet() {
        System.out.println("Good Night!");
    }
}

  class Test {
    public static void main(String[] args) throws Exception{
        X x = new Z();
        x.greet(); //Line n1
        ((Y)x).greet(); //Line n2
        ((Z)x).greet(); //Line n3
        StringBuilder s = new StringBuilder("D");
            met();
    }
    static void met()throws Exception {
        throw null;

    }
}
class Parent {
    int var = 1000; // Line n1

    int getVar() {
        return var;
    }
}

class Child extends Parent {
    private int var = 2000; // Line n2

    int getVar() {
        return super.var; //Line n3
    }
}

class Testo {
    public static void main(String[] args) {
        Child obj = new Child(); // Line n4
//        System.out.println(obj.var); // Line n5
        X1 obj1 = new X0();
        obj1.print();
        int i = 0;
        for(System.out.print(i++);
            i < 2;
            System.out.print(i++)
        ) {
            System.out.print(i);
        }
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()+" "+text); //Line n2
//        N.main(args); //Line n4
        String str = "df";
        String str2 = "df";
        System.out.println(str.contentEquals(str2));
        int integer = 78____0;
        try {
//        }catch(IOException e){
//            Exception ex = new Exception(e);
        }finally{
            System.out.println("alo");
        }

    }
}
class M {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}

class N extends M {
//    public static void main(String[] args) { //Line n2
//        new M().main(args); //Line n3
//    }
}
class A {
    public String toString() {
        return null;
    }
}

interface X1 {
    default void print() {
        System.out.println("X1");
    }
}

interface X2 extends X1 {
    void print();
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class X0 implements X3 {}
abstract class R {
    public abstract void m ();
}
class S extends R {
    public void m () {}
}

