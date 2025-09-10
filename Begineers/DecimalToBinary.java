package Begineers;

import java.util.Scanner;

public class DecimalToBinary{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        System.out.println("Binary representation of decimal number: " + binary);
    }
}