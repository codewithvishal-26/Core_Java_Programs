package Begineers;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of element want to insert:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        System.out.println("Reversed Array-------");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
