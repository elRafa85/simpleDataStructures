package udemy.algorithms.binarysearch;

/** This is for binary search implements divide and conquer technique
 * It returns the index that matched the item to search for
 * Returns -1 if not found
 * Created by rafae on 6/9/2017.
 */
public class BinarySearch {

    /* {1,2.3,4,5,6,7,8,9,10} */

    public int search (int[] array, int whatToFind){
        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int mid = getMiddle(low, high);
            if (whatToFind < array[mid]) {
                high = mid-1;
            } else if(whatToFind > array[mid]){
                low = mid+1;
            }
            else return mid;
        }
        return -1;
    }

    private int getMiddle(int low, int high){
        return low + (high-low)/2;
    }

}
