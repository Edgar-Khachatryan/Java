package testSortings.testSelection;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import Sorting.SelectionSort.Selection;

public class SelectionTest {

    /**
     * testing selection sort
     */

    public void selectTest(){
        Selection selection = new Selection();
        int[] arr = {5,1,3,4,2,7};
        int[] expected = {1,2,3,4,5,7};
        assertArrayEquals(selection.select(arr), selection.select(expected));
    }
}
