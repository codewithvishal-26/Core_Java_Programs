package Begineers;

import java.util.Scanner;

public class RevOfInt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rev = 0;

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        while(num != 0 ){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse of given number is: "+ rev);
        sc.close();
    }
}
