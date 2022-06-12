package fedorovsa.algorithms;

public class DivideAndConquerFindMax {

    private static int findMaxFromStart(int[] array, int n) {
        if (n < array.length) {
            int max = findMaxFromStart(array, n + 1);
            return Math.max(max, array[n]);
        } else {
            return array[0];
        }
    }

    public static int findMaxFromEnd(int[] array, int n) {
        if (n > 0) {
            int max = findMaxFromEnd(array, n - 1);
            return Math.max(max, array[n - 1]);
        } else {
            return array[array.length - 1];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 8, 6, 4, 16, 9, -5};
        System.out.println(findMaxFromEnd(array, array.length));
        int[] arr = new int[] {3, 16, -9, 6, 12, 10, -7};
        System.out.println(findMaxFromStart(arr, 0));
    }
}
