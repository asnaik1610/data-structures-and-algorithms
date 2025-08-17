package recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) { // assumming n is non-negative
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
}
