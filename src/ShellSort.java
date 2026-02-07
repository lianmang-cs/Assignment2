//Done (Recheck)
import java.util.Arrays;
public class ShellSort{
    public void insertionSortInterleaved(int[] array, int startIndex, int gap) {
        int size = array.length;
        for(int i = startIndex + gap; i < size;i+= gap) {
            int j = i;
            while(j-gap >= startIndex && array[j] < array[j-gap]) {
                //swap
                int temp = array[j];
                array[j] = array[j-gap];
                array[j-gap] = temp;
                j -= gap;
            }
        }
    }
    public void ShellSort(int[] array, int[] gap_array) {
        int gapSize = gap_array.length;
        for(int i = 0; i < gapSize; i++) {
            for(int j = 0; j < gap_array[i]; j++) {
                insertionSortInterleaved(array, j, gap_array[i]);

            }
        }
    }
}
