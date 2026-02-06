//Done
import java.util.Arrays;
public class BubbleSort {
    public void bubbleSort(int[] array) {
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
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] A = {3, 12, 0, 34, 5, 23, 18, 9};
        //BubbleSort
        sort.bubbleSort(A);
        System.out.println("Bubble Sorted: ");
        System.out.println(Arrays.toString(A));
    }
}
