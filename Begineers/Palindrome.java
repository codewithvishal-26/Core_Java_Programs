package Begineers;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;

        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int orignalNum = num;

        while (num != 0) {
            int rem = num % 10;
            digit = digit * 10 + rem;
            num = num / 10;
        }

        if(orignalNum == digit) {
            System.out.println(orignalNum+ " "+ "It is palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
        sc.close();

    }
}
