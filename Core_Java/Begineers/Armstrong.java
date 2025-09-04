package Begineers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;

        int digits = String.valueOf(num).length();

        while(num!=0){
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        if(result == originalNum){
            System.out.println("Perfect you have entered the armstrong number");
        }else{
            System.out.println("Sorry it is not an armstrong number");
        }

    }
}
