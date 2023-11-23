package literalOctals;

import java.util.Arrays;

public class ArraysManipulation {
    public static void main(String[] args) {

//        double[] a = new double[2.55];
        double[] b = new double[3 * 4 / 2];

        int[] tree = {10, 11, 12}; //without new keyword it is called anonymous array

        int[] ids, types;//creates 2 array
        int ids2[], types2;// creates array and int, bad practice


        String [] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals)); //true
        System.out.println(animals == myAnimals);  //true
        System.out.println(Arrays.equals(animals,myAnimals));//true

        System.out.println(animals.equals(otherAnimals));//false
        System.out.println(animals == otherAnimals);//false
        System.out.println(Arrays.equals(animals,otherAnimals)); //true this one checks the objects

        myLabel : {
            int[] myArray = {1, 2, 3};
        }

        String[] someAnimals = {"Dog", "Cat", "Lizzard", "Bird", "Snake"};

        MY_LOOP:for (String animal : someAnimals) {
            if (animal.equals("Cat")){
                break;
            }
            System.out.println(animal);
        }

        String[] arr = {"50", "500", "9"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[50, 500, 9]
                                                //it checks every index of strings char value
        int[]nums = {5,3,10,8,6};
        System.out.println(Arrays.binarySearch(nums,7));


    }



}
