import java.util.Arrays;
public class MergeSort {
    public static void merge(int[] array, int leftFirst, int leftLast, int rightLast) {
        int mergeSize = rightLast - leftFirst + 1;
        int[] mergeNumbers = new int[mergeSize];
        int mergePos = 0;
        int leftPos = leftFirst;
        int rightPos = leftLast + 1;

        while(leftPos <= leftLast && rightPos <= rightLast) {
            if (array[leftPos] <= array[rightPos]) {
                mergeNumbers[mergePos] = array[leftPos];
                leftPos++;
            }
            else {
                mergeNumbers[mergePos] = array[rightPos];
                rightPos++;
            }
            mergePos++;
        }

        while(leftPos <= leftLast) {
            mergeNumbers[mergePos] = array[leftPos];
            leftPos++;
            mergePos++;
        }

        while(rightPos <= rightLast) {
            mergeNumbers[mergePos] = array[rightPos];
            rightPos++;
            mergePos++;
        }
        //Copy merged numbers back into the array
        for(mergePos = 0; mergePos < mergeSize; mergePos++) {
            array[leftFirst + mergePos] = mergeNumbers[mergePos];
        }

    }
    public void mergeSort(int[] array, int startIdx, int endIdx) {
        if(startIdx < endIdx) {
            int mid = (startIdx + endIdx) / 2;

            mergeSort(array, startIdx, mid);
            mergeSort(array, mid + 1, endIdx);
            //merge left and right partitions
            merge(array, startIdx, mid, endIdx);
        }
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] A = {3, 12, 0, 34, 5, 23, 18, 9};
        int startIdx = 0;
        int endIdx = 7;
        sort.mergeSort(A, startIdx, endIdx);
        System.out.println(Arrays.toString(A));
    }
}
