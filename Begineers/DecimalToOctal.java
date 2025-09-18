package Begineers;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any decimal number: ");
        int n = sc.nextInt();

        String octal = Integer.toOctalString(n);

        System.out.println("After conversion octal number is: " + octal);
    }
}
