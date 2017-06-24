package udemy.algorithms.insertsort;

/**Insert Sort algorithm
 * sorts a small set of data
 * it compares current number with previous and swaps if smaller
 * Created by rafae on 6/8/2017.
 */
public class InsertSort {

    public int[] sort(int[] array){
        //receive an array
        //{3,2,1,5,4}
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j>0; j--) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
        return array;
    }

    void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }

}
