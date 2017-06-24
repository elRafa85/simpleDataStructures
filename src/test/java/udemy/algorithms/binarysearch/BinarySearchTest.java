package udemy.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rafae on 6/9/2017.
 */
public class BinarySearchTest {

    BinarySearch binarySearch;

    @Before
    public void setup(){
        binarySearch = new BinarySearch();
    }

    @Test
    public void searchSuccess(){
        int[] array = {1,2,3,4,5,10,20,40,41,50};
        int index = binarySearch.search(array, 5);
        Assert.assertEquals(4, index);
    }

    @Test
    public void numberNotFound(){
        int[] array = {1,2,3,4,5,10,20,40,41,50};
        int index = binarySearch.search(array,0);
        Assert.assertEquals(-1,index);
    }
}
