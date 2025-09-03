package Begineers;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter" +" " + "elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter search element");
        int key = sc.nextInt();

        boolean found = false;
        for(int i = 0; i<n; i++){
            if(arr[i] == key){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            } 
        }

        if(!found){
            System.out.println("Element not found!");
        }

    
    }
}
