package ocp.lukapopov.beyondclasses.nestedclasses.first;

public class A {
    private String str = "Hello!";
    protected class B {//INNER CLASS
        private static void printOut(String s){
            System.out.println(s);
        }
        public void printHelloTwice(){
            printOut(str);//str is visible o inner class
            printOut(str);
        }
    }

    public void printTwice() {
        var b = new B();
        b.printHelloTwice();//creating the instance and calling the method
    }

    public static void main(String[] args) {
        var a = new A();
        a.printTwice();

        System.out.println();

        //if a method is not static you have to make an instance before calling it
        var b = a.new B();
        b.printHelloTwice();

        System.out.println();

        //even shorter (but uglier)
        new A().new B().printHelloTwice();


    }
}


/**
 * @implNote Nested classes can have their own nested classes
 */
class A2 {
    private int t = 1;
    class B{
        private int t = 2;
        class C {
            private int t = 3;
            public void printT(){
                System.out.println("t = " + t);//3
                System.out.println("this.t = " + this.t);//3
                System.out.println("B.this.t = " + B.this.t);//2
                System.out.println("B.t = cte");
                System.out.println("A2.this.t = "+A2.this.t);//1
                System.out.println("A2.B.t = cte");
                System.out.println("A2.t = cte");
                System.out.println("A2.B.this.t = " + A2.B.this.t);//2
            }
        }
    }

    public static void main(String[] args) {
        //initialize all classes
        A2 a = new A2();
        B b = a.new B();
        B.C c = b.new C();
        c.printT();

    }
}