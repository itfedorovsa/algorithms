package fedorovsa.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyMaxNumberFromDigits {

    public static String maxNumFromDigits(int[] array) {
        Arrays.sort(array);
        StringBuilder builder = new StringBuilder();
        for (int index = array.length - 1; index >= 0; index--) {
            builder.append(array[index]);
        }
        return builder.toString();
    }

    public static String maxNumberFromDigits(int[] array) {
        return String.join("", Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 2, 9};
        System.out.println(maxNumberFromDigits(array));
        System.out.println(maxNumFromDigits(array));
    }
}
