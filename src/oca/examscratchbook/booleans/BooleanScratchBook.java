package oca.examscratchbook.booleans;

public class BooleanScratchBook {
    static final boolean DEBUG = false;
    public static void main(String[] args) {
//        boolean a = new Boolean(Boolean.valueOf(args[0]));
//        boolean b = new Boolean(args[1]);
//        System.out.println(a+" "+b);
        System.out.println(Boolean.valueOf("1"));
        System.out.println(Boolean.valueOf("0"));
        System.out.println(Boolean.valueOf("null"));

//        LocalDate date1 = LocalDate.of(6, 20, 2014);
//        System.out.println("date1 = "+date1);
//        long a = 234433455345;
        long b = 2_344_334_553_450L;
//        Double d = 2342345432323423453234234.343F;
//        Float f1 = 2342345345452342323423434.234534234534;
//        Float f2 = 234.3;
        System.out.println(b);
        Integer in = 234;
        int m = Integer.parseInt("7");
        m = Integer.valueOf(in);
        String title = """ 
                            "Java SE 17 Developer Course"
                            by Luka Popov
                            """;
        System.out.println("title = " + title+"Hello!");
         int s;
        Integer integer = null;
        boolean bb = integer instanceof Object ;
        int i = 32;
        int i1 = 1;
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        int i2 = i >>>= i1;
        System.out.println("i2 = " + i2);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);

//        for(;;){}//infinite loop, makes rest of the code unreachable

        if (DEBUG) {
            System.out.println("#4545");//should be unreachable
        }

        for (int iii = 0; iii < 10; iii++) {
            iii++;
            System.out.println(iii);
            break;
//            System.out.println("323443");
        }
        System.out.println("\n\n\n\n");

        for (int p = 0, r = 0; (p + r) < 5; p++, r++) {
            System.out.println(p+" "+r);
        }

        System.out.println("\n\n\n\n");

        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        System.out.println(b1^b2);
        System.out.println(b1^b3);
        System.out.println(b4^b3);
        int number = 23234;
        int bit =~ number;// -number-1=(-23235)
        System.out.println("bit = " + bit);
        System.out.println(-bit);
        byte by = 34;
        short sh = 23;
        char ch = '2';
        char cha = ch;
        short sho = (short)(ch+by+sh);
//        short shor = (short)ch+(short)by+(short)sh; cte
        short x = 5;
        short y = 7;
//        short z = x+y; int data type
        short t = 4+5;
        long lll = (long)1232456345645643563475656235256345.35674576845678678679567845623423465F;
        byte bbbb = (byte)23.2F;
        switch (x) {
            case 5:
                System.out.println("passed");
        }
        String strng = switch (x) {
            case 5 -> "Good morning";
            default -> throw new IllegalStateException("Unexpected value: " + x);
        };

        try {
            System.out.println("");
        } catch (IndexOutOfBoundsException | NullPointerException exception) {
            System.out.println("4");
        }
        System.out.println(getDirection(Compass.SOUTH));
    }
    public void returning(){
        for (int iii = 0; iii < 10; iii++) {
            iii++;
            System.out.println(iii);
            return;
//            System.out.println("323443");
        }
    }

    enum Compass{NORTH, SOUTH, EAST, WEST}

    static String getDirection(Compass value){
        return
                switch (value) {
                    case NORTH-> "Up";
                    case SOUTH-> "Down";
                    case EAST-> "Right";
                    case WEST-> "Left";
                };
    }
    public strictfp void doesNotCompile (boolean isOK){
        int a;
        if (isOK) {
            a=5;
        }else{
            a=2;
            System.out.println("jsdhds");
        }
        System.out.println(a);
    }
//    public int sum(var a, var b){int result = a+b;return result;}
}
class Base{
    public void test(){
        System.out.println("Base ");
    }
}
class DerivedA extends Base{
    public void test(){
        System.out.println("DerivedA ");
    }
}
class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base)b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}

class App{
    int count;
    public static void displayMsg(){
//        count++;
//        System.out.println("Welcome "+"Visit Count: "+count);
    }

    public static void main(String[] args) {
        App.displayMsg();
        App.displayMsg();
    }
}

class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
class C extends A{
    public void test(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1 = new A();
        b1.test();
        A b2 = new C();
        b1 = (A)b2;
        C b4 = (C)b1;
        b4.test();
//        A b3 = (B)b2;
        b1.test();
//        b3.test();
    }
}
class ABCDD {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
