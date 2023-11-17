package literalOctals;

public class LiteralOctalsRunner {
    public static void main(String[] args) {

        long max = 34_434_345_323L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07;
        int firstOct= 010; // 8 decimal
        int secondOct = 022; // 18 decimal
        double d = 23_23.23_2;
        int r = 0b1;
        int rq = 0xE;
        float f = 233.23F;
        long lll = 3242342524L;
        long ll = 32423425;


        Integer itg = 256;
        Integer itg2 = 256;
        System.out.println("itg == itg2 = " + (itg == itg2));
        itg = 127;
        itg2 = 127;
        System.out.println("itg == itg2 = " + (itg == itg2));
        System.out.println("itg = " + itg);
        System.out.println("itg2 = " + itg2);
        System.out.println("System.identityHashCode(itg) = " + System.identityHashCode(itg));
        System.out.println("System.identityHashCode(itg2) = " + System.identityHashCode(itg2));
        System.out.println("Integer.highestOneBit(itg) = " + Integer.highestOneBit(itg));
        System.out.println("Integer.lowestOneBit(itg) = " + Integer.lowestOneBit(itg));
        System.out.println("Integer.highestOneBit(itg2) = " + Integer.highestOneBit(itg2));
        System.out.println("Integer.lowestOneBit(itg2) = " + Integer.lowestOneBit(itg2));
        itg = 127;
        itg2 = 127;
        System.out.println("itg == itg2 = " + (itg == itg2));
        System.out.println("itg = " + itg);
        System.out.println("itg2 = " + itg2);
        System.out.println("System.identityHashCode(itg) = " + System.identityHashCode(itg));
        System.out.println("System.identityHashCode(itg2) = " + System.identityHashCode(itg2));
        System.out.println("Integer.highestOneBit(itg) = " + Integer.highestOneBit(itg));
        System.out.println("Integer.lowestOneBit(itg) = " + Integer.lowestOneBit(itg));
        System.out.println("Integer.highestOneBit(itg2) = " + Integer.highestOneBit(itg2));
        System.out.println("Integer.lowestOneBit(itg2) = " + Integer.lowestOneBit(itg2));
        itg = 128;
        itg2 = 128;
        System.out.println("itg == itg2 = " + (itg == itg2));
        System.out.println("itg = " + itg);
        System.out.println("itg2 = " + itg2);
        System.out.println("System.identityHashCode(itg) = " + System.identityHashCode(itg));
        System.out.println("System.identityHashCode(itg2) = " + System.identityHashCode(itg2));
        System.out.println("Integer.highestOneBit(itg) = " + Integer.highestOneBit(itg));
        System.out.println("Integer.lowestOneBit(itg) = " + Integer.lowestOneBit(itg));
        System.out.println("Integer.highestOneBit(itg2) = " + Integer.highestOneBit(itg2));
        System.out.println("Integer.lowestOneBit(itg2) = " + Integer.lowestOneBit(itg2));
        itg = 127;
        itg2 = 127;
        System.out.println("itg == itg2 = " + (itg == itg2));
        System.out.println("itg = " + itg);
        System.out.println("itg2 = " + itg2);
        System.out.println("System.identityHashCode(itg) = " + System.identityHashCode(itg));
        System.out.println("System.identityHashCode(itg2) = " + System.identityHashCode(itg2));
        System.out.println("Integer.highestOneBit(itg) = " + Integer.highestOneBit(itg));
        System.out.println("Integer.lowestOneBit(itg) = " + Integer.lowestOneBit(itg));
        System.out.println("Integer.highestOneBit(itg2) = " + Integer.highestOneBit(itg2));
        System.out.println("Integer.lowestOneBit(itg2) = " + Integer.lowestOneBit(itg2));
        itg = 255;
        itg2 = 255;
        System.out.println("itg == itg2 = " + (itg == itg2));
        System.out.println("itg = " + itg);
        System.out.println("itg2 = " + itg2);
        System.out.println("System.identityHashCode(itg) = " + System.identityHashCode(itg));
        System.out.println("System.identityHashCode(itg2) = " + System.identityHashCode(itg2));
        System.out.println("Integer.highestOneBit(itg) = " + Integer.highestOneBit(itg));
        System.out.println("Integer.lowestOneBit(itg) = " + Integer.lowestOneBit(itg));
        System.out.println("Integer.highestOneBit(itg2) = " + Integer.highestOneBit(itg2));
        System.out.println("Integer.lowestOneBit(itg2) = " + Integer.lowestOneBit(itg2));
        itg = 257;
        itg2 = 257;
        System.out.println("itg == itg2 = " + (itg == itg2));
        System.out.println("itg = " + itg);
        System.out.println("itg2 = " + itg2);
        System.out.println("System.identityHashCode(itg) = " + System.identityHashCode(itg));
        System.out.println("System.identityHashCode(itg2) = " + System.identityHashCode(itg2));
        System.out.println("Integer.highestOneBit(itg) = " + Integer.highestOneBit(itg));
        System.out.println("Integer.lowestOneBit(itg) = " + Integer.lowestOneBit(itg));
        System.out.println("Integer.highestOneBit(itg2) = " + Integer.highestOneBit(itg2));
        System.out.println("Integer.lowestOneBit(itg2) = " + Integer.lowestOneBit(itg2));



        int sumOct = firstOct+secondOct;
        System.out.println("firstOct = " + firstOct);
        System.out.println("secondOct = " + secondOct);
        System.out.println("sumOct = " + sumOct + " octSum=" + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; //15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex;
        System.out.println("firstHex = " + firstHex);
        System.out.println("secondHex = " + secondHex);
        System.out.println("sumHex = " + sumHex+" hexSum = "+Integer.toHexString(sumHex));

        System.out.println();

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexPi = " + hexPi);

        char uniChar = '\u03A9'; //upper case greek omega character
        char romanNumber = '\u216C';// roman 50 number

        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);

//        boolean true = false;
        // one line

    }
}
