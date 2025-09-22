package Begineers;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending number:  ");
        int end = sc.nextInt();

        System.out.println("Strong number from " +start + " and " +end +" are: " );

        for(int num = start; num <=end; num++){
            int temp = num;
            int sum=0;

            while(temp > 0){
                int digit = temp%10;
                int fact = 1;

                for (int i = 1; i <= digit; i++) {
                    fact*= i;
                }

                sum += fact;
                temp /=10;
            }

            if(sum == num){
                System.out.println(num + "");
            }
        }
        sc.close();
    }
}
