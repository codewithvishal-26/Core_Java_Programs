package Begineers;

import java.util.Scanner;

public class AllDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<n;i++){
            if(n%i == 0){
                System.out.print("Divisors are: ");
                System.out.println(i);
            }
        }
        sc.close();
    }
}
