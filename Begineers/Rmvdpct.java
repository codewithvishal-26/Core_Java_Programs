package Begineers;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Rmvdpct {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Set<Integer> uniquSet = new LinkedHashSet<>();
        for(int num : arr){
            uniquSet.add(num);
        }

        System.out.println("Array after removing duplicate: " + uniquSet);

        sc.close();
    }

}
