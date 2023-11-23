package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        String[] petsArray = {"dog","cat","parrot"};
        List<String> petList = Arrays.asList(petsArray); //returns fixed size list
                                                        // with asList method, bound array and list effects each other


        System.out.println("petList = " + petList);
        System.out.println("petsArray = " + Arrays.toString(petsArray));

        petList.set(0,"bird");
        System.out.println("petList = " + petList);
        System.out.println("petsArray = " + Arrays.toString(petsArray));

        petsArray[2]="sfdf";
        System.out.println("petList = " + petList);
        System.out.println("petsArray = " + Arrays.toString(petsArray));

//        petList.add("petsList");
//        petList.remove(1);
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(0);
        System.out.println(n);
        System.out.println(n.remove(0));
        System.out.println(n);
    }
}
