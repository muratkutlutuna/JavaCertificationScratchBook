package examscratchbook.terminalscratchbook.p2;

import examscratchbook.terminalscratchbook.p1.Acc;

public class Test extends Acc{
    public static void main(String[] args) {
        Test obj = new Test();
//        obj.q;//q is private
        int r1 = obj.r;
        int s1 = obj.s;
//        obj.p;//p is default should be public,
                // can not be reached from out of the package
    }
}
