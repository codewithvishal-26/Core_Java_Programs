package Begineers;

import java.util.Scanner;

public class Fact_recurs {

    // recursive function
    static int factorial(int n) {
        if (n == 0 || n == 1)         // base case
            return 1;
        return n * factorial(n - 1); // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial: " + factorial(n));
        sc.close();
    }
}
