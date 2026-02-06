//Done
public class SelectionSort implements SortingAlgorithms{
    public int[] sorty(int[] array) {
        int size = array.length;
        for(int i = 0; i < size;i++) {
            int smallIdx = i;
            for(int j = i + 1; j < size; j++) {
                if(array[j] < array[smallIdx]) {
                    smallIdx = j;
                }
            }
            //swap
            int temp = array[i];
            array[i] = array[smallIdx];
            array[smallIdx] = temp;
        }
        return array;
    }
}
