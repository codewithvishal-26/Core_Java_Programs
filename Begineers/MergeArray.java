package Begineers;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements for first array: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter no of elements: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements for second array: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        int[] MergeArray = new int[n1 + n2];

        for(int i=0; i<n1;i++){
            MergeArray[i] = arr1[i];
        }

        for(int i=0; i<n2; i++){
            MergeArray[n1+i] = arr2[i];
        }

        System.out.println("Merged Array: ");
        for(int num: MergeArray){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
