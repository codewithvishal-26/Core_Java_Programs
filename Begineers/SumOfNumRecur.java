package Begineers;

import java.util.Scanner;

public class SumOfNumRecur {


    static int sum(int n){
        if(n==0){
            return 0;
        }else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int result = sum(n);

        System.out.println("Sum of first "+ n + " natural numbers is: " + result);

        sc.close();
    }
}
