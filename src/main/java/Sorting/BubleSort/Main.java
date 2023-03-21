package Sorting.BubleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Bubble sort = new Bubble();
        int[] arr = {5,1,3,4,2,7};
        System.out.println(Arrays.toString(sort.buble(arr)));
    }
}
