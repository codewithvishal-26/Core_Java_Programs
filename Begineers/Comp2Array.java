package Begineers;

import java.util.*;

public class Comp2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Element you want to insert in first Array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter element you want to insert in first Array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter 2nd element array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Arrays are equals!");
        }else{
            System.out.println("Arrays are not equals!");
        }

        sc.close();
    }
}
