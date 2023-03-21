package testSortings.testInsertion;

import Sorting.InsertionSort.Insertion;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class InsertionTest {

    /**
     * testing insertion sort
     */

    public void insertTest(){
        Insertion ins = new Insertion();
        int[] arr = {5,1,3,4,2,7};
        int[] expected = {1,2,3,4,5,7};
        assertArrayEquals(ins.insertion(arr), ins.insertion(expected));

    }
}
