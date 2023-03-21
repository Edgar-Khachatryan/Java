package Sorting.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Insertion insert = new Insertion();
        int[] arr = {5,1,3,4,2,7};
        System.out.println(Arrays.toString(insert.insertion(arr)));
    }

}
