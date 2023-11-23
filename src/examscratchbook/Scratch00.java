package examscratchbook;

public class Scratch00 {
    public static void main(String[] args) {
        char ch = 7;
        switch (ch) {
            case 7:
                System.out.println("ok");
                break;
            default:
                System.out.println("no");
                break;
        }
        System.out.println(ch);


        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        int nt = 3;
        long ng = 38888888888888899L;
        float at = 242.234F;
        boolean an = true;
        char ar = 'A';
        boolean isEqualNtNg = nt==ng;
        boolean isEqualAtNg = at==ng;
//        boolean isEqualAnNg = an==ng;
        boolean isEqualArNg = ar==ng;


        System.out.println(str.equals(sb) + ":" + sb.equals(str));


    }
}

class Probe {

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10.0, new Integer(10));
    }

}
