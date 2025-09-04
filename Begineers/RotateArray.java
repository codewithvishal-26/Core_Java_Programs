package Begineers;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int first = arr[0];
        for(int i=0; i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1] = first;

        System.out.println("Array after left rotation: ");
        for(int num : arr){
            System.out.print(num+ " ");
        }

        sc.close();
    }
}
