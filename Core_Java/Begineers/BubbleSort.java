package Begineers;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort (ascending order)
        for (int i = 0; i < num - 1; i++) {
            int minIdx = i;
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
