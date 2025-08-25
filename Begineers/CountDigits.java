package Begineers;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }

        }
        System.out.println("Total digits in a number: " + count);

    }

}

