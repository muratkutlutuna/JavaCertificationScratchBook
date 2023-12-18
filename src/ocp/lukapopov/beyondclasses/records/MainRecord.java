package ocp.lukapopov.beyondclasses.records;

public class MainRecord {
    public static void main(String[] args) {
        StudentRecordClass src = new StudentRecordClass("Luka", "popov", 1);
        System.out.println("src.firstName() = " + src.firstName());
        System.out.println("src.lastName() = " + src.lastName());
        System.out.println("src.id() = " + src.id());

        System.out.println("\nStudent toString() method = " + src);

        var anotherSrc = new StudentRecordClass("Luka","popov",1);
        System.out.println("\nanotherSrc.equals(src) = " + anotherSrc.equals(src));

        System.out.println("\nanotherSrc==src = " + (anotherSrc==src));


        //we can override auto-generated constructor
        //this is called "canonical constructor"



        //Compact Constructor
        var scc = new StudentCompactConstructor2("muRat kUtlu", "tUNa", 22);
        System.out.println("scc = " + scc);


    }
}
