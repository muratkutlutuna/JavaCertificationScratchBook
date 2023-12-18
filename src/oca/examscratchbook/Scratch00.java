package oca.examscratchbook;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scratch00 {
    Double d1;
    int x = d1.intValue();
    public static void main(String[] args) {
        String strr = " ";
        String trim = strr.trim();
        System.out.println("trim = " + trim);
        System.out.println("trim.equals(\"\") = " + trim.equals(""));
        System.out.println("trim.isEmpty() = " + trim.isEmpty());
//        System.out.println("trim.isBlank() = " + trim.isBlank());
        int inticer = 8;
        inticer++;
        char ch = 7;
        switch (ch) {
            case 7:
                System.out.println("ok");
                break;
            default:
                System.out.println("no");
                break;
        }
//        try {
//            System.out.println(1);
//        } catch (NullPointerException ex) {
//            System.out.println("ONE");
//        } catch (FileNotFoundException ex) {
//            System.out.println("TWO");
//        }
        System.out.println("THREE");
        System.out.println(ch);
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.set(0, "List");;;;;
        StringBuilder sb2 = new StringBuilder("SpaceStation");
        sb2.delete(5, 6).insert(5, " S").toString().toUpperCase();
        System.out.println(sb2);
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
//        Boolean bln = null;
//        if (bln) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        LocalDate ld = LocalDate.parse("2006-03-16");
        System.out.println(ld.withDayOfYear(29));


        System.out.println(str.equals(sb) + ":" + sb.equals(str));

        float ft = (float)1_11.00;
        Float fit = (float)100.00;
        int y2 = 200;
        float ftt = (float) y2;
        Object obj = new Probe();
        double y1 = 203.22;
//        float fii=Float.intBitsToFloat(y1);

//        var s  = 3;

        byte []arrr = new byte[0];
//        System.out.println(arrr[0]);
        Hoi h = new Hoi();
        h.alo();

        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        System.out.println(fruit);

        Period p = Period.parse("p-30000y");
        List<abc> l = new ArrayList<>();
//        l.add(1,new Hoi());
        boolean b = new Hoi() instanceof abc;
        System.out.println(l);
//        Integer it = new Integer(45);

        LocalDate date = LocalDate.of(1987, 9, 1);
//        String sffgfdgdfe = date.format(DateTimeFormatter.ISO_DATE_TIME);
    }
    public static void callExport(Collection<String> list){

    }

     String[] method(){return null;}
    {

//        l.add(new hoi());
    }
}
interface abc{}
abstract class ddd {}
class Hoi implements abc{
    @Override
    public String toString() {
        return "Hoi{}";
    }

    void alo()throws RuntimeException{
        System.out.println("Alo");
    }
}

class Probe {

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

//    public static void main(String[] args) {
//        add(10.0, new Integer(10));
//    }

}
final class FinalClass{}
//private class PrivateClass{}
//class ChildFinalClass extends FinalClass{}

//class ChildPrivateClass extends PrivateClass{}

class Teto extends Exception{
    public Teto(String s){
        super(s);
    }
}
class Cla {
    private int inti;
    public int getInti(){
        return inti;
    }
}

class CompilationErrorrr{
    public static void main(String[] args) {
        Error obj = new Error();
//        boolean flag1 = obj instanceof RuntimeException; //Line n1
//        boolean flag2 = obj instanceof Exception; //Line n2
//        boolean flag3 = obj instanceof Error; //Line n3
//        boolean flag4 = obj instanceof Throwable; //Line n4
//        System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);
    }
}


interface Exportable{
    void export();
}

class Tool implements Exportable{
    public void export(){
        System.out.println("Tool::export");
    }
}

class ReportTool extends Tool{
   public void export(){
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex){
        ex.export();
    }
}






