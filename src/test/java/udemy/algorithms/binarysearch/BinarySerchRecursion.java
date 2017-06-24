package udemy.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rafae on 6/10/2017.
 */
public class BinarySerchRecursion {

    BinarySearchRecursion binarySearchRecursion;

    @Before
    public void init(){
        binarySearchRecursion = new BinarySearchRecursion();
    }

    @Test
    public void searchRecursionTest(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int index = binarySearchRecursion.search(array,9);
        Assert.assertEquals(8,index);

    }

}
