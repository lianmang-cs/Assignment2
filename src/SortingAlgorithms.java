import java.awt.desktop.QuitEvent;
import java.util.Arrays;

public class SortingAlgorithms {
    public void BubbleSort(int[] array) {
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
    }
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
    public void SelectionSort(int[] array) {
        int size = array.length;
        for(int i = 0; i < size;i++) {
            int smallestIndex = i;
            for(int j = i + 1; j < size; j++) {
                if(array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            //swap
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }
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
    public int partition(int[] array, int lowIdx, int highIdx) {
        int midpoint = lowIdx + (highIdx - lowIdx) / 2;
        int pivot = array[midpoint];
        boolean done = false;
        while(!done) {
            while(array[lowIdx] < pivot) {
                lowIdx++;
            }
            while(array[highIdx] > pivot) {
                highIdx--;
            }
            if(lowIdx >= highIdx) {
                done = true;
            }
            else {
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
    public void QuickSort(int[] array, int startIdx, int endIdx) {
        if(endIdx <= startIdx) {
            return;
        }
        int high = partition(array, startIdx, endIdx);

        QuickSort(array, startIdx, high);
        QuickSort(array, high + 1, endIdx);

    }
    public void MergeSort(int[] array) {

    }
    public static void main(String[] args) {
        SortingAlgorithms sort = new SortingAlgorithms();
        //Array of Integers
        int[] A = {3, 12, 0, 34, 5, 23, 18, 9};
        System.out.println("Unsorted: " + Arrays.toString(A));

        //BubbleSort
        //sort.BubbleSort(A);
        //System.out.println("Bubble Sorted: ");
        //System.out.println(Arrays.toString(A));

        //InsertionSort
        //sort.InsertionSort(A);
        //System.out.println("Insertion Sorted: ");
        //System.out.println(Arrays.toString(A));

        //SelectionSort
        //sort.SelectionSort(A);
        //System.out.println("Selection Sorted: ");
        //System.out.println(Arrays.toString(A));

        //ShellSort
        //int[] gap_array = {4, 2, 1};
        //sort.ShellSort(A, gap_array);
        //System.out.println("Shell Sorted: ");
        //System.out.println(Arrays.toString(A));

        //QuickSort
        //int startIdx = 0;
        //int endIdx = 7;
        //sort.QuickSort(A, startIdx, endIdx);
        //System.out.println("Quick Sorted: ");
        //System.out.println(Arrays.toString(A));

        //MergeSort
        System.out.println("Merge Sorted: ");
        System.out.println(Arrays.toString(A));






    }
}
