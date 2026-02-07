public class BubbleSort implements SortingAlgorithms{
    public int[] sorty(int[] array) {
        int size = array.length;
        for(int i = 0; i < size -1; i++) {
            for(int j = 0; j < size -1; j++) {
                if(array[j] > array[i]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
