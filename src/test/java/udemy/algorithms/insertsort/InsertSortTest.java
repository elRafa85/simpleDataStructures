package udemy.algorithms.insertsort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rafae on 6/6/2017.
 */
public class InsertSortTest {

    InsertSort insertSort;

    @Before
    public void setup(){
        insertSort = new InsertSort();
    }

    @Test
    public void swapTest(){
        int[] array = {5,1,23,122,9,15};
        insertSort.swap(array,1,2);
        int[] expectedArray = {5,23,1,122,9,15};
        Assert.assertArrayEquals(expectedArray,array);
    }

    @Test
    public void sortSuccess(){
        int[] array = {5,1,23,122,9,15};
        int[] expectedArray = {1,5,9,15,23,122};
        array = insertSort.sort(array);
        Assert.assertArrayEquals(expectedArray,array);
    }

    @Test
    public void sortRepeatedNumbers(){
        int[] array = {5,1,1,23,122,9,9,15};
        int[] expectedArray = {1,1,5,9,9,15,23,122};
        array = insertSort.sort(array);
        Assert.assertArrayEquals(expectedArray,array);
    }


}
