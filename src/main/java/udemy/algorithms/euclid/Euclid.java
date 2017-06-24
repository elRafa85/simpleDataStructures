package udemy.algorithms.euclid;

/**Euclid algorithm calculates greatest common divisor between 2 numbers
 * Created by rafae on 6/7/2017.
 */
public class Euclid {


    public int greatCommonDivisor(int number, int divisor) {
        //10/2 = remaining = 0
        int remaining = (number % divisor);
        if (remaining == 0) {
            return divisor;
        } else {
            return greatCommonDivisor(divisor, remaining);
        }
    }

}
