package Begineers;

public class FactOfNum {

    public static void main(String[] args) {
        int num = 5;    // Example number
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Calculate factorial
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
