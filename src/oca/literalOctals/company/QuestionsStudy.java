package oca.literalOctals.company;

public class QuestionsStudy {
    public static void main(String[] args) {
        long x = 10;
        int y = (int)(2 * x);


        switch ((byte)x) {
            default:
                System.out.println(y);
                break;
        }
        --x;
        x--;
        if (x == y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//        else{
//            System.out.println(true^false);
//        }
        System.out.println(x>2?x<4?10:8:7);
        for (int i = 0; i < 10; ) {
            i=++i;
            System.out.println(i);
        }


    }
}
