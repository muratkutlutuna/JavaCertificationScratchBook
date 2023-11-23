package examscratchbook.studentlist;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
}
public class Test {
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("James", 25));
//        for(Student stud : students) {
//            System.out.println(stud);
//        }
//        System.out.println();
//        students.add(new Student("James", 27));
//        for(Student stud : students) {
//            System.out.println(stud);
//        }
//        System.out.println();
//        System.out.println(students.add(new Student("James", 25)));
//        for(Student stud : students) {
//            System.out.println(stud);
//        }
//        System.out.println();
//        students.add(new Student("James", 25));
//        System.out.println();
//        for(Student stud : students) {
//            System.out.println(stud);
//        }
//        System.out.println();
//        System.out.println(students.remove(new Student("James", 25)));
////        System.out.println(Student("James", 25));
//        System.out.println();
//
//        for(Student stud : students) {
//            System.out.println(stud);
//        }
//        try {
//            int i = 0 / 0;
//        } catch (RuntimeException e) {
//            System.out.println("Runtime");
//        } catch (ArithmeticException e) {
//
//        }

        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

//        if(list.contains('O')) {
//            list.remove((char)'7');
//        }
//
//        for(char ch : list) {
//            System.out.print(ch);
//        }
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);
    }
    Exception method(){
        Exception e = new RuntimeException();
        return e;
    }
    void m1()throws IOException {
        throw new FileNotFoundException();
    }
}