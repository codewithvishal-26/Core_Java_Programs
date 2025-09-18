package Begineers;

import java.util.Scanner;

public class SumOfPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first range: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second range: ");
        int n2 = sc.nextInt();

        int sum = 0;

        for(int n = n1; n <=n2; n++){
            boolean isPrime = true;

            if(n<=1){
                isPrime = false;
            } else {
                for(int i =2;i<=Math.sqrt(n);i++){
                    if(n%i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                sum += n;
            }
        }

        System.out.println("Sum of prime numbers in a range from " + n1 + " and " + n2 + " is " + sum);
        sc.close();
    }
}

