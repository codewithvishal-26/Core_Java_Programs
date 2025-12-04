package Begineers;

public class Fib_recurs {
    // recursive function
    static int fibonacci(int n) {
        if (n == 0)                 // base case
            return 0;
        if (n == 1)                 // base case
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive case
    }

    public static void main(String[] args) {
        int n = 10; // Example: Calculate Fibonacci of 10
        System.out.println("Fibonacci of " + n + ": " + fibonacci(n));
    }
}
