package Begineers;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) { // check divisibility
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }
        }

        if (isPrime) {
            System.out.println("Number is prime!");
        } else {
            System.out.println("Number is not prime");
        }

        sc.close();

    }
}
