package ocp.lukapopov.beyondclasses.nestedclasses.localclass;


/**
 * @implNote calculate and print area of the rectangle
 */
public class PrintArea {
    private int a = 10;
    public void calculateArea(){
        final int b = 15;// => because b is final
                         // (without keyword final b would be effectively final
                         // and therefore still accessible by computer
        class Computer{//local class
            public void multiply(){
                System.out.println(a*b);
            }
        }//Note: class Computer can access both a and b
        var computer = new Computer();//goes out of scope when we exit the method
        computer.multiply();
    }

    public static void main(String[] args) {
        var printArea = new PrintArea();
        printArea.calculateArea();
    }
}
