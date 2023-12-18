package ocp.lukapopov.collections.sortingdata;

import java.util.*;

public class SortingData {
    //Primitive sorted by natural order
    //Strings numbers sort before letters and uppercase letters sort before lowercase

    //Comparable<T> interface
    //--this interface has one abstract method: int compareTo(T o)
    //----this methods has to be implemented in a concrete class
    //--this method returns an integer according to these rules:
    //--1-if the current object is equivalent to the argument it returns 0
    //--2-if the current object is smaller than the argument it returns a negative number
    //--3-if the current object is larger than the argument it returns a positive number

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John",25),
                new Person("George",20),
                new Person("Ben",30)
        );
        Collections.sort(people);
        System.out.println("people = " + people);


        List<Person2> people2 = Arrays.asList(
                new Person2("John",25),
                new Person2("George",20),
                new Person2("Ben",30)
        );
        Collections.sort(people2);
        System.out.println("people2 = " + people2);

        Collections.sort(people2,(p1,p2)->p1.getAge()-p2.getAge());
        System.out.println("people2 = " + people2);

        Collections.sort(people2,(p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println("people2 = " + people2);

        System.out.println("\n Same thing without lamda (the old way)");
        List<Person>people3 = Arrays.asList(
                new Person("John",25), new Person("George",20),
                new Person("Ben",30));
        Comparator<Person>byAge = new Comparator<Person>(){
            //implementation of compare() method using anonymous class
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge()-p2.getAge();
            }
        };
        Collections.sort(people3,byAge);//passing the implementation in the sort() method
        System.out.println("people3 = " + people3);

        System.out.println("\nusning comparing() method with method reference\nto sort by name");
        Comparator<Person> c1 = Comparator.comparing(Person::getName);

        System.out.println("\nto sort by name in reversed order");
        Comparator<Person>c2=Comparator.comparing(Person::getName).reversed();

        System.out.println("\nto sort by name and then by age(if names are the same)");
        Comparator<Person> c3 = Comparator.comparing(Person::getName).thenComparingInt(Person::getAge);
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override

    public int compareTo(Person other) {
        //0 if ages are equal
        //<0 if age is smaller than age in the argument
        //>0 if age is greater than age in the argument
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override

    public int compareTo(Person2 other) {
        //String class has the implementation of
        //compareTo() method, so you can just
        //use it here
        return this.name.compareTo(other.name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
