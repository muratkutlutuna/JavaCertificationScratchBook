package ocp.lukapopov.beyondclasses.enums;

//NOTE: ENUM values must be listed at the beginning!!
public class Enums {
    static Compass N = Compass.NORTH;
    static Compass W = Compass.valueOf("WEST");

    public static void main(String[] args) {
        System.out.println("N==Compass.NORTH = " + (N == Compass.NORTH));//true
        System.out.println("(W==Compass.WEST) = " + (W == Compass.WEST));//true

        for (var direction:Compass.values()) {
            System.out.println(direction.ordinal() + " : " + direction.name());
        }

        System.out.println("\nenums are often used in switch");
        switch (N) {
            case NORTH -> System.out.println("You are headed North.");
            case SOUTH -> System.out.println("You are headed South.");
//            case Compass.WEST -> System.out.println("You are headed West.");//wrong syntax
//            case 1 -> System.out.println("1");//wrong syntax, The datatype of the switch paramater
//                                                should be same as case paramaters
            default -> System.out.println("Get back!");
        }


        System.out.println("\nenums can have constructors and instance methods");
        System.out.println("Compass2.NORTH.printInstruction();");
        Compass2.NORTH.printInstruction();
        //-1-the constructors are called for each enum (only once)
        //-2-the instroction "Move up" is printed by printInstruction() method


        System.out.println("\nenums can implement abstract methods");
        System.out.println("Compass3.SOUTH.getDirection() = " + Compass3.SOUTH.getDirection());


        System.out.println("\nmethods can be overriden by certain enums only");
        System.out.println("Compass4.SOUTH.getDirection() = " + Compass4.SOUTH.getDirection());
        System.out.println("Compass4.EAST.getDirection() = " + Compass4.EAST.getDirection());


        System.out.println("\nENUMS cannot extend a class, but can implement an interface");
        System.out.println("Compass5.NORTH.getPlanetName() = " + Compass5.NORTH.getPlanetName());
    }
}

/**
 * @see java.lang.Enum
 * @implNote Basic impelementation of ENUMs
 */
enum Compass{
    NORTH,SOUTH,EAST,WEST;//";" optional for simple enums
}


/**
 * @implNote enums can have constructors and instance methods
 */
enum Compass2{
    NORTH("Move Up"),//constructor calls but without new keyword
    SOUTH("Move Down"),
    EAST("Move Right"),
    WEST("Move Left");//";" is required
    private final String instruction;
    Compass2(String instruction){//ENUM constructor implicitly private
        this.instruction=instruction;
    }

    public void printInstruction() {
        System.out.println(instruction);
    }
}

/**
 * @implNote enums can implement abstract methods
 */
enum Compass3{
    NORTH{public String getDirection(){return "Up";}},
    SOUTH{public String getDirection(){return "Down";}},
    EAST{public String getDirection(){return "Right";}},
    WEST{public String getDirection(){return "Left";}};
    public abstract String getDirection();
}

/**
 * @implNote methods can be overriden by certain enums only
 */
enum Compass4{
    NORTH{public String getDirection(){return "Up";}},
    SOUTH{public String getDirection(){return "Down";}},
    EAST, WEST;//use default implementation
    public String getDirection(){return "Sideways";}
}


/**
 * @implNote ENUMS cannot extend a class, but can implement an interface
 */
interface Planet{
    String getPlanetName();
}
enum Compass5 implements Planet{
    NORTH,SOUTH,EAST,WEST;

    @Override
    public String getPlanetName() {
        return "Earth";
    }
}