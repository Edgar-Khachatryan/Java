package testSortings.testBubble;

import Sorting.BubleSort.Bubble;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleTest {

    /**
     * testing bubble sort
     */

    @Test
    public void bubbleSort(){
        Bubble test = new Bubble();

       int[] arr = {5,1,3,4,2,7};
        int[] expected = {1,2,3,4,5,7};
        assertArrayEquals(test.buble(arr), test.buble(expected));
    }

}
