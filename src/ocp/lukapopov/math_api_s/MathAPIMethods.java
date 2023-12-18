package ocp.lukapopov.math_api_s;

public class MathAPIMethods {

    public static void main(String[] args) {

        //min(), max()
        int a = Math.max(3, 11);
        int b = Math.min(2, -4);

        //you can compare all types of NUMBERS, but be aware of autocasting
        long aa = 5;
        int bb = 3;
//        int cc = Math.max(aa, bb);
        int dd = (int)Math.max(aa, bb);


        //round()
        //if partameter is float, return type will be int
        //if partameter is double, return type will be long
        double d3 = 2.56;
        long a3 = Math.round(d3);
//        int b3 = Math.round(d3);
        int c3 = (int)Math.round(d3);


        //exponents: pow()
        //takes any number, returns double
        double p = Math.pow(2, 5);
        double q = Math.pow(25,0.5);//square


        //random numbers
        double ran = Math.random();
        //random number between 0 and 1.0 (not included)


    }


}
