package Begineers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        for(int i = 0; i< num; i++){
            sum += i;
        }
        System.out.println("Sum of digits are : " + sum);

        sc.close();
    }
}
