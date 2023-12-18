package oca.examscratchbook;

import java.io.IOException;
import java.util.*;

public class Scratch03 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("TOMATO");
//        System.out.println(sb.reverse().replace("O", "A"));


        String str = "John\\nwick\\rdoe\\ndoe\\tdoe";
        System.out.println("str = " + str);
        System.out.println("str.translateEscapes() = " + str.translateEscapes());

        String name = "John";
        int numberOfMarbles = 5;
        String printout1 = name + " has " + numberOfMarbles + " marbles";
        String printout2 = String.format("%s has %d marbles", name, numberOfMarbles);
        String printout3 = "%s has %d marbles".formatted(name,numberOfMarbles);
        String printout4 = "John has 5 marbles";
        System.out.println("printout1 = " + printout1);
        System.out.println("printout2 = " + printout2);
        System.out.println("printout3 = " + printout3);
        System.out.println("printout4 = " + printout4);
        System.out.println("printout1==printout3 = " + (printout1 == printout3));
        System.out.println("printout2==printout3 = " + (printout2 == printout3));
        System.out.println("printout2==printout1 = " + (printout2 == printout1));
        System.out.println("printout4==printout1 = " + (printout4 == printout1));
        System.out.println("printout4==printout2 = " + (printout4 == printout2));
        System.out.println("printout4==printout3 = " + (printout4 == printout3));

        System.out.println("printout1.equals(printout2) = " + printout1.equals(printout2));
        System.out.println("printout1.equals(printout3) = " + printout1.equals(printout3));
        System.out.println("printout2.equals(printout3) = " + printout2.equals(printout3));
        System.out.println("printout4.equals(printout3) = " + printout4.equals(printout3));
        System.out.println("printout4.equals(printout2) = " + printout4.equals(printout2));
        System.out.println("printout4.equals(printout1) = " + printout4.equals(printout1));


    }
}

class Solution2Sum {
    private List<List<Integer>> res;

    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        return new AbstractList<List<Integer>>() {
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }
            public int size() {
                init();
                return res.size();
            }
            private void init() {
                if (res != null) return;
                Arrays.sort(nums);
                int l, r;
                int sum;
                Set<List<Integer>> tempRes = new HashSet<>();
                for (int i = 0; i < nums.length - 2; ++i) {
                    l = i + 1;
                    r = nums.length - 1;
                    while (l < r) {
                        sum = nums[i] + nums[l] + nums[r];
                        if (sum == target) {
                            List<Integer> t = new ArrayList<>();
                            t.add(nums[i]);
                            t.add(nums[l]);
                            t.add(nums[r]);
                            tempRes.add(t);
                        }
                        if (sum < target) ++l;
                        else --r;
                    }
                }
                res = new ArrayList<List<Integer>>(tempRes);
            }
        };
    }
}

abstract class Animall{
    abstract void jump()throws RuntimeException;
}
class Deer extends Animall{
    void jump(){
        System.out.println("Deer Jumps");
    }
    void jump(int i){
        System.out.println("Deer Jumps " + i + " Feet");
    }
}
class Testl{
    public static void main(String[] args) {
        Animall animal = new Deer();
        ((Deer)animal).jump();
        ((Deer)animal).jump(5);
    }
}


interface Super {
    String name = "SUPER"; //Line n1
}



interface Sub extends Super { //Line n2

}


class Tests {
    public static void main(String[] args) {
        Sub sub = null;
        System.out.println(sub.name); //Line n3
    }
}


class Base {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Derived extends Base {
    static void print() { //Line n2
        System.out.println("DERIVED");
    }
}

class Testb {
    public static final void main(String... args) {
        Base b = null;
        Derived d = (Derived) b; //Line n3
        d.print(); //Line n4
    }
}

class ExceptionTest{
    public static void main(String[] args) {
        try {
            met();
        } catch (IOException e) {
            System.out.println("IOException is unchecked exception");
        }
    }
    public static void met () throws IOException {
        System.out.println("met");
    }

}
 class AvoidThreats {
    public Threat evaluate(Threat t) { //Line n5
        t.name="PHISHING"; //Line n6
        return t; //Line n7
    }

    public static void main(String[] args) {
        Threat obj = new Threat(); //Line n1
        obj.print(); //Line n2
        AvoidThreats a = new AvoidThreats();
        a.evaluate(obj); //Line n3
        obj.print(); //Line n4
    }
}

class Threat {
    String name = "VIRUS";

    public Threat(String name) {
        this.name = name;
    }

    public Threat() {
    }

    public void print() {
        System.out.println(name);
    }
}
