package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generic {

    /**
     * Swaping two elements from array
     * @param arr
     * @param first
     * @param second
     * @param <T>
     */

    public  <T> void swapPositions(T[] arr, int first, int second){

        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    /**
     * finding maximum element from list
     * @param arr
     * @return
     * @param <T>
     */

    public <T> T findMax(List<T> arr){

        List<T> sort = new ArrayList<>(arr);

        sort.sort(Collections.reverseOrder());

        return sort.get(0);

    }
}
