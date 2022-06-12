package fedorovsa.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int index = 1; index < array.length; index++) {
                if (array[index] < array[index - 1]) {
                    int temp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 1, -5, -2, 5, 3, -3, 0, -4, -1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
