package udemy.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rafae on 6/6/2017.
 */
public class CrazyCalculationTest {

    CrazyCalculation calculation;

    @Before
    public void setup(){
        calculation = new CrazyCalculation();
    }

    @Test
    public void calculateValid(){
        int result = calculation.calculate(2);
        Assert.assertEquals(5, result);
    }
}
