package udemy.algorithms.binarysearch;

/**
 * Created by rafae on 6/10/2017.
 */
public class BinarySearchRecursion {
    int[] array;
    int whatToLookFor;

    public int search(int[] array, int whatToLookFor){
        this.array = array;
        this.whatToLookFor = whatToLookFor;
        return search(0, array.length-1);
    }

    private int search(int low, int high){
        int mid = getMidIndex(low, high);
        if(whatToLookFor < array[mid]) {
            return(search(low, mid-1));
        } else if (whatToLookFor > array[mid]){
            return search(mid+1,high);
        } else if ((whatToLookFor == array[mid] )) {
            return mid;
        }
        return -1;
    }

    private int getMidIndex(int low, int high) {
        return low + ((high-low)/2);
    }
}
