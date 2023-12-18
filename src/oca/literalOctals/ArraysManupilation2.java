package oca.literalOctals;

public class ArraysManupilation2 {

    public static void main(String[] args) {

        int[] myArray = new int[]{0, 1};// normal Array,
                                        // without new int[] these part
                                        // is become anonymous array

        //2d Array
        int[][] array = new int[2][];//2 rows and 4 columns
                                      // rows always come first
        int anotherArray[][] = new int [2][];
        int [] myIntArray[] = new int[2][];// do not use this in your project

        String[][] my2dArray = new String[][]{
                {"One","Two"}, //1st row 2 elements
                {"Three","Four","Five"},//2nd row 3 elements
                {"Six","Seven","Eight","Nine"},//3th row with 4 elements
                null
        };
        //3rd array
        //pages(planes), rows, columns
        int[][][]threeArrays = new int[3][3][3];
        int[][]confusingArray[]=new int[3][3][3];
        int[]confusingArray2[][]=new int[3][3][3];
        int confusingArray3[][][]=new int[3][3][3];

        int[]arr1;
        int[]arr2 = new int[3];
        int[] arr3 = {'a', 'b'};
        arr1 = arr2;
        arr1 = arr3;

        int number = 120;
        switch (number){
            default:
                System.out.println("default");
            case 0:
                System.out.println("case1");
            case 10*2-19:
                System.out.println("case2");
        }



    }

}
