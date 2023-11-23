package methods;
import static java.util.Collections.sort;
public class MethodsScratchBook {
    private static final String leftRope;
    private static final String rightRope;
//    private static final String bench;
    private static final String name = "name";

    static{
        leftRope = "left";
        rightRope = "right";
    }

    static{
//        name = "name";
//        rightRope = "right";
    }

    public static void main(String[] args) {
//        bench = "bench";
        AbstractClass obj1 = new AbstractClass("hoi"){
            @Override
            public String getName() {
                return super.getName();
            }
        };

        ChildClass obj = (ChildClass) obj1;
        obj.getName();
    }

}
