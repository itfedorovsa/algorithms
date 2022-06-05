package fedorovsa.algorithms;

public class MinValueArray {
    public static void main(String[] args) {
        int[] source = new int[] {5, 3, 7, 2, 1, 4, 6, 9, 8};
        int minValue = source[0];
        int minIndex = 0;
        for (int index = 1; index < source.length; index++) {
            if (minValue > source[index]) {
                minValue = source[index];
                minIndex = index;
            }
        }
        System.out.println("MinValue: " + minValue + ", MinIndex: " + minIndex);
    }
}
