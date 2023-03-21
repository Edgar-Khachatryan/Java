package Sorting.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Selection selected = new Selection();
        int[] arr = {5,1,3,4,2,7};
        System.out.println(Arrays.toString(selected.select(arr)));
    }
}
