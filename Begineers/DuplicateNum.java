package Begineers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }

        if(duplicates.isEmpty()){
            System.out.println("No duplicates found: ");
        }else{
            System.out.println("Duplicates elements are: " + duplicates);
        }
        sc.close();
    }
}
