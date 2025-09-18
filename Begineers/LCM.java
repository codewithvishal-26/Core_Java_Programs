package Begineers;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        int num1 = a;

        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int num2 = b;

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        System.out.println("The LCM of given number is: " + lcm);
    }
}
