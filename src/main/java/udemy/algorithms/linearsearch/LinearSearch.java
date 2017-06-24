package udemy.algorithms.linearsearch;

/**Linear Search
 * Created by rafae on 6/7/2017.
 * this Searches an array until the input matches a value in the array
 * if no value is found -1 is returned
 */
public class LinearSearch {

    public int search(int number, int[] array){
        for(int i = 0; i <array.length; i++){
            if (array[i] == number) return i;
        }
        return -1;
    }

}
