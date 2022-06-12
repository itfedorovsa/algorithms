package fedorovsa.algorithms;

public class DivideAndConquerArraySum {

    public static int findSum(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return array[n - 1] + findSum(array, n - 1);
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 6, 8};
        System.out.println(findSum(array, array.length));
    }
}
