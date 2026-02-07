public class QuickSort {
    public int partition(int[] array, int lowIdx, int highIdx) {
        int midpoint = lowIdx + (highIdx - lowIdx) / 2;
        int pivot = array[midpoint];
        boolean done = false;
        while (!done) {
            while (array[lowIdx] < pivot) {
                lowIdx++;
            }
            while (array[highIdx] > pivot) {
                highIdx--;
            }
            if (lowIdx >= highIdx) {
                done = true;
            } else {
                //swap
                int temp = array[lowIdx];
                array[lowIdx] = array[highIdx];
                array[highIdx] = temp;
                lowIdx++;
                highIdx--;
            }
        }
        return highIdx;
    }
    public void quickSort(int[] array, int startIdx, int endIdx) {
        if(endIdx <= startIdx) {
            return;
        }
        int high = partition(array, startIdx, endIdx);

        quickSort(array, startIdx, high);
        quickSort(array, high + 1, endIdx);
    }
}
