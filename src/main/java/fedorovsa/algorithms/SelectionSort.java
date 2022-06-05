package fedorovsa.algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static int minArrayValueInRange(int[] source, int start) {
        int minValue = source[start];
        int minIndex = start;
        for (int index = start + 1; index < source.length; index++) {
            if (minValue > source[index]) {
                minValue = source[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    public static int[] selectionSort(int[] source) {
        for (int step = 0; step < source.length; step++) {
            int index = minArrayValueInRange(source, step);
            int temp = source[step];
            source[step] = source[index];
            source[index] = temp;
        }
        return source;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 7, 2, 1, 4, 6, 9, 8};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
