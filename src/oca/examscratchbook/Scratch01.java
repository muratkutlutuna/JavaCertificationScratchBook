package oca.examscratchbook;


import java.io.IOException;

public class Scratch01 {
    public static void main(String[] args) {
        System.out.println("Hello "+new StringBuilder("Java SE 8"));
        System.out.println("Hello "+new MyString("Java SE 8"));

        float var1 = (12_345.01<=123_45.00)?12_456:124_56.02f;
        float var2 = var1+1024;
        System.out.println(var2);

        StringBuilder sb = new StringBuilder("Java");
        sb.toString();
        String s = "Java";
        s.toString();

        String str = "3";
        str.equals(str);

        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1+s2;
//        String s4 = (String)(s3*s2);

        System.out.println(Math.random());

//        Float fit = 100.00;


        int x = 6;
        while(isAvailable(x)){
            System.out.print(--x);

        }
    }
    public static boolean isAvailable(int x){
        return --x > 0? true:false;
    }
}

class MyString{
    String msg;
    MyString(String msg){
        this.msg = msg;
    }
}

interface I{
    void displayI();
}
abstract class C2 implements I{
    public void displayC2(){
        System.out.print("C2");
    }

}
class C1 extends C2 {
    public void displayI(){
        System.out.print("C1");
    }
    private void method(){
        System.out.println("Method");
    }
}
class Main2{
    public static void main(String[] args) {
        C2 o1 = new C1();
        I o2 = new C1();

        C2 s = (C2) o2;//C2 s = new C2();
        I t = o1;// I t = new C1();



        t.displayI();
        s.displayC2();
    }
}
class MyException extends RuntimeException{}
class Test123 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.println("A");
        }
    }
    public static void method1(){

        try {
            throw 3 > 10 ? new MyException() : new IOException();
        }catch (IOException ie) {
            System.out.println("I");
        } catch (Exception re) {
            System.out.println("B");
        }

    }

}

class Test124 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.println("A");
        }
    }
    public static void method1(){

        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.println("B");
        }

    }

}

class TestException{
    void readCard(int cardNo)throws Exception{
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo)throws RuntimeException {
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        TestException ex = new TestException();
        int cardNo = 12344;
//        ex.readCard(cardNo);
        ex.checkCard(cardNo);
    }
}

abstract class Planets{
    public RuntimeException revolve(){
        return new RuntimeException();
    }
    abstract void rotate();
}
class Earth extends Planets{
    public IndexOutOfBoundsException revolve(){
        return new IndexOutOfBoundsException();
    }
     void rotate(){}
}


class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age =25;
    Person(String name){
        setName(name);
    }
    public Person(String name, int age){
        this(name);
        setAge(age);
    }

    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
class Shop{
    public static void main(String[] args) {
        int price = 1000;
        int qty = 2;
        String grade = "2";
        double discount = 0.0;
        switch (grade) {
            case "1":
                discount = price*0.1;
                break;
            case "2":
                discount = price * 0.5;
//                continue;
            default:
                System.out.println("Thank You!");
        }
        System.out.println(discount);
    }
}

