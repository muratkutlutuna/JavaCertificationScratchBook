package ocp.lukapopov.beyondclasses.records;

import java.util.Objects;

/**
 * @implNote The old way of creating encapsulated class
 */
public final class Student {//final means this class can not be extended,
    //                        this secures encapsulation
    //                        because you can not access the field through hte subclass

    //--1-declare private final fileds
    private final String firstName;
    private final String lastName;
    private final int id;

    //--2-define the constructor
    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //--3-define getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    //--4-override toString() method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    //--5-override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null||getClass()!=obj.getClass()) return false;
        Student student = (Student) obj;

        return id==student.id&& Objects.equals(firstName,student.firstName)&&Objects.equals(lastName,student.lastName);
    }

    //--6-override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,id);
    }



}

record StudentReord(String firstName, String lastName, int id){}
