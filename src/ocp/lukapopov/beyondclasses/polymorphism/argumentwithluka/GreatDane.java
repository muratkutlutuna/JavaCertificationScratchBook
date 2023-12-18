package ocp.lukapopov.beyondclasses.polymorphism.argumentwithluka;

public class GreatDane extends Dog{
//    public int getSpeed(){//WRONG it can not hide it, it won't compile in the first place
//        return 35;
//    }
    public static void main(String[] args) {
        new GreatDane().printSpeed();
    }
}
