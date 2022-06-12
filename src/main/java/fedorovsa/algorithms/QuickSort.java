package fedorovsa.algorithms;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] array, int from, int to) {
        if (from < to) {
            int pivotIndex = separation(array, from, to);
            quickSort(array, from, pivotIndex - 1);
            quickSort(array, pivotIndex, to);
        }
        return array;
    }

    public static int separation(int[] array, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = array[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {
                while (array[leftIndex] < pivot) {
                    leftIndex++;
                }
                while (array[rightIndex] > pivot) {
                    rightIndex--;
                }
                if (leftIndex <= rightIndex) {
                    swap(array, leftIndex, rightIndex);
                    leftIndex++;
                    rightIndex--;
                }
        }
        return leftIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 1, -5, -2, 5, 3, -3, 0, -4, -1};
        System.out.println(Arrays.toString(quickSort(array, 0, array.length - 1)));
    }
}
