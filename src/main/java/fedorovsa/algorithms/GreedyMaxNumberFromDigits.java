package fedorovsa.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyMaxNumberFromDigits {

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
    }
}
