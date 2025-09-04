package Begineers;

import java.util.Scanner;

public class SecLargElem {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("No of element to insert: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n<2){
            System.out.println("Array should have 2 elemets");
        }
        int largest = Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secLarg = largest;
                largest = num;
            } else if(num>secLarg && num != largest){
                secLarg = num;
            }
        }

        if(secLarg == Integer.MIN_VALUE){
            System.out.println("No second largest element(all elements are same.)");
        }else {
            System.out.println("Second largest element: " + secLarg);
        }
        
}
}