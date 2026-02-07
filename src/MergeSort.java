public class MergeSort implements SortingAlgorithms {
    public int[] sorty(int[] array) {
        if(array.length <= 1) {
            return array;
        }
        int middle = array.length/2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[array.length-middle];
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            if(i < middle) {
                leftArr[i] = array[i];
            }
            else {
                rightArr[j] = array[i];
                j++;
            }
        }
        leftArr =  sorty(leftArr);
        rightArr = sorty(rightArr);
        return merge(array, leftArr, rightArr);
    }
    public static int[] merge(int[] array, int[] leftArr, int[] rightArr) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int leftPos = 0;
        int rightPos = 0;
        int i = 0;
        while (leftPos < leftSize && rightPos < rightSize) {
            if (leftArr[leftPos] < rightArr[rightPos]) {
                array[i] = leftArr[leftPos];
                i++;
                leftPos++;
            } else {
                array[i] = rightArr[rightPos];
                i++;
                rightPos++;
            }
        }
        while (leftPos < leftSize) {
            array[i] = leftArr[leftPos];
            i++;
            leftPos++;
        }

        while (rightPos < rightSize) {
            array[i] = rightArr[rightPos];
            i++;
            rightPos++;
        }
        return array;
    }
}
