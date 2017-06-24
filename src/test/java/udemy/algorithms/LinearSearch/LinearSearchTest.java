package udemy.algorithms.LinearSearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import udemy.algorithms.linearsearch.LinearSearch;

/**
 * Created by rafae on 6/6/2017.
 */
public class LinearSearchTest {

    LinearSearch linear;

    @Before
    public void setup(){
        linear = new LinearSearch();
    }

    @Test
    public void searchSuccess(){
        int[] array = {5,1,23,122,9,15};
        Assert.assertEquals(4, linear.search(9,array));
        Assert.assertEquals(0, linear.search(5,array));
    }

    @Test
    public void elementNotFound(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        Assert.assertEquals(-1,linear.search(11,array));
    }


}
