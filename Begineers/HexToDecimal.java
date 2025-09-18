package Begineers;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int n = sc.nextInt();

        String hex = Integer.toHexString(n);

        System.out.println("After conversion the number is : " + hex);
    }
}
