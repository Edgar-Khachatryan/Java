package Sorting.BubleSort;

public class Bubble {

    /**
     * performing bubble sort algorithm
     * @param arr
     * @return
     */

    public int[] buble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]=temp;
                    }
            }
        }
        return arr;
    }

}
