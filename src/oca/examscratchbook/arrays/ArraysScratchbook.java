package oca.examscratchbook.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysScratchbook extends Error{
    public static void main(String[] args) {
        String[]arr = {"Hi","How","Are","You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
//        if (arrList.removeIf((String s) -> {return s.length()<=2;})) {
//            System.out.println("removed");
//        }


        if (arrList.removeIf(s -> {
            System.out.println(s);
            return s.length()<=2;
        })) {
            System.out.println(" removed");
        }
        int nums[];
        nums=new int [2];
        nums[0]=10;
        nums[1]=20;

        nums = new int[4];
        nums[2]=30;
        nums[3]=40;
        for (int x : nums) {
            System.out.print (" "+x);
        }
        System.out.println(Arrays.toString(nums));
    }
}
