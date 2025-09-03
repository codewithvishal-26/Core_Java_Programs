package Begineers;

import java.util.Scanner;

public class MissingNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N (the range): ");
        int n = sc.nextInt();

        int[] arr = new int[n-1];
        System.out.println("Enter " + (n-1)+ " elements");
        int sumOfArray = 0;

        for(int i=0; i<(n-1);i++){
            arr[i] = sc.nextInt();
            sumOfArray += arr[i];
        }

        int totalSum = n * (n+1)/2;
        int MissingNum = totalSum - sumOfArray;

        System.out.println("Missing number is: " + MissingNum);

        sc.close();
}
}