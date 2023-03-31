package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Generic gen = new Generic();

        /**
         * swapping elements in array
         */

        Integer[] arr = {1,2,3,4,5};

        gen.swapPositions(arr,1,4);
        System.out.println(Arrays.toString(arr));

        /**
         * finding maximum value from list
         */

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(1);
        nums.add(12);
        nums.add(2);
        nums.add(-5);

        System.out.println(gen.findMax(nums));



    }
}
