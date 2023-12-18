package ocp.lukapopov.beyondclasses.polymorphism.example;

public class Cat {
    protected int age = 5;
    public String art = "cat";
    public static String type = "pet";
    public static boolean isWild(){return false;}
    public boolean roars(){return false;}
}
class Tiger extends Cat{
    protected int age = 7;
    public String art = "tiger";
    public static String type = "notPet";
    public static boolean isWild(){return true;}
    public boolean roars(){return true;}

    public static void main(String[] args) {
        Tiger dave = new Tiger();
        Cat rave = dave;
        System.out.println("dave.isWild() = " + dave.isWild());//true
        System.out.println("rave.isWild() = " + rave.isWild());//false
        System.out.println("dave.roars() = " + dave.roars());//true
        System.out.println("rave.roars() = " + rave.roars());//true
        System.out.println("dave.art = " + dave.art);
        System.out.println("rave.art = " + rave.art);
        System.out.println("dave.type = " + dave.type);
        System.out.println("rave.type = " + rave.type);
        System.out.println("type = " + type);
        System.out.println("dave.age = " + dave.age);//7
        System.out.println("rave.age = " + rave.age);//5
    }
}
