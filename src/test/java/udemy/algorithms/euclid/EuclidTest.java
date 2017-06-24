package udemy.algorithms.euclid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rafae on 6/6/2017.
 */
public class EuclidTest {

    Euclid divisor;

    @Before
    public void setup(){
        divisor = new Euclid();
    }

    @Test
    public void calculateValidTenByTwo(){
        int result = divisor.greatCommonDivisor(10,2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void calculateValidTenBy6(){
        int result = divisor.greatCommonDivisor(22,6);
        Assert.assertEquals(2, result);
    }
}
