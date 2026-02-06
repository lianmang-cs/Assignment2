//Done
import java.util.Arrays;
public class InsertionSort {
    public void InsertionSort(int[] array) {
        int size = array.length;
        for(int i = 1; i < size;i++) {
            int j = i;
            while(j > 0 && array[j] < array[j-1]) {
                //swap
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }
}
