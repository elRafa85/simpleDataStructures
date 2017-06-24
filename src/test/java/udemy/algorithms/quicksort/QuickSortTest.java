package udemy.algorithms.quicksort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rafae on 6/13/2017.
 */
public class QuickSortTest {

    QuickSort quickSort;
    int[] array = {7,1,5,10,2};

    @Before
    public void init(){
        quickSort = new QuickSort();

    }

    @Test
    public void quickSortTest(){
        int[] expectedArray = {1,2,5,7,10};
        array = quickSort.sort(array);

        Assert.assertArrayEquals(expectedArray,array);
    }
}
