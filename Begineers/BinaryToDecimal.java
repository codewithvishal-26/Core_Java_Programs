package Begineers;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number to convert in decimal:");
        String n = sc.next();

        int decimal = Integer.parseInt(n,2);

        System.out.println("Decimal Number: " + decimal);
    }
}
