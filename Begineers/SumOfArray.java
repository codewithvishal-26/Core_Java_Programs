package Begineers;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter no of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter no of element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array of given element: " + sum);
        sc.close();
    }
    
}
