package fedorovsa.algorithms;

public class MinValueArray {

    public static int minValueArray(int[] source) {
        int minValue = source[0];
        int minIndex = 0;
        for (int index = 1; index < source.length; index++) {
            if (minValue > source[index]) {
                minValue = source[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 7, 2, 1, 4, 6, 9, 8};
        int index = minValueArray(array);
        System.out.println("MinValue: " + array[index]
                + ", MinIndex: " + index);
    }
}
