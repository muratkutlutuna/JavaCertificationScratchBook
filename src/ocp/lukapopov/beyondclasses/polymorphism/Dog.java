package ocp.lukapopov.beyondclasses.polymorphism;

public class Dog {
    public boolean canRun(){
        return true;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
//        Cat cat = (Cat)Dog;//CTE, the compiler doesn't allow casts to unrelated types
        //this can be avoided using instanceof operator
    }
    public int getSpeed(){return 20;}
    public void printSpeed(){//overriden method
        System.out.println(this.getSpeed());
    }
}

class GreatDane extends Dog{
    @Override
    public int getSpeed() {//overriding method
        return 35;
    }

    public static void main(String[] args) {
        new GreatDane().printSpeed();//Which getSpeed() will be used?
        //Since getsSpeed() is override in a subclass,
        // all calls to thus method will be replaced at the runtime!

        //you can always limit polymorphism by making methods final,
        // in which case they can't be overriden in a subclass
    }
}

interface CanRun{boolean canRunFast();}


/**
 * @implNote Once you create a new reference, only the members of that reference type
 *           are accessible via that reference(!!)
 */
class ShihTzu extends Dog implements CanRun{
    public boolean canRunFast(){return false;}
    public int weight = 6;

    public static void main(String[] args) {
        ShihTzu shihTzu = new ShihTzu();
        System.out.println(shihTzu.weight);//6
        Dog dog = shihTzu;//implicit casting to a supertype, OK
        ShihTzu secondShihtzu = (ShihTzu)dog;//explicit cast to supertype, OK
//        ShihTzu thirdShihtzu = dog;//CTE, you cannot put larger in smaller without the explicit cast
        System.out.println(dog.canRun());//true
//        dog.canRunFast();//Does not compile
        //method canRunFast() is not a member of Dog class
        CanRun canRun = shihTzu;
        System.out.println(canRun.canRunFast());//false
//        canRun.weight;//Does not compile
        //Weigth is not a member of CanRun interface
    }
}

/**
 * @implNote the compiler doesn't allow casts to unrelated types
 */
class Cat{}