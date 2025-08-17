package recursion;

public class SumOfNNumbers {
    public static int sum(int n) {
        if (n <= 0) { // assuming n is non-negative
            return 0; // Base case
        }
        return sum(n - 1) + n; // Recursive case
    }
}
