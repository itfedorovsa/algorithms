package fedorovsa.algorithms;

public class Recursion {
    public static int fact(int num) {
        int rsl = 0;
        if (num == 0 || num == 1) {
            return 1;
        } else if (num > 1) {
            rsl = num * fact(num - 1);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
