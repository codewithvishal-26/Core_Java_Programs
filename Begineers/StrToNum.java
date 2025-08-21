package Begineers;

import java.util.Scanner;

public class StrToNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        String str1 = String.valueOf(num);

        String str2 = Integer.toString(num);

        System.out.println("String using value of: " + str1);
        System.out.println("String using toString: " + str2);
    }
}
