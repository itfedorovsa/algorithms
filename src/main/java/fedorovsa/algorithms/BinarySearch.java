package fedorovsa.algorithms;

public class BinarySearch {
    public static int binarySearch(int[] list, int item) {
        int low = 0, mid;
        int high = list.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (item > list[mid]) {
                low = mid + 1;
            } else if (item < list[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {-6, -1, 2, 5, 12, 23};
        System.out.println("Index: " + binarySearch(numbers, 12));
        System.out.println("Index: " + binarySearch(numbers, -1));
    }
}
