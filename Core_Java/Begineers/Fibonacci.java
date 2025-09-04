package Begineers;
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;   // Calculate the next term
            a = b;              // Update a to the next term
            b = next;          // Update b to the next term
        }   
        System.out.println(); // New line after the series
    }
}