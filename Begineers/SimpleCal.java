package Begineers;

import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose a operator: +, -, *, /");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println("After addition: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("After subtracting: " + result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("After multiplication: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("After division: "+ result);
                break;
            default:
                System.out.println("Invalid input!");          
        }

        sc.close();
    }
}
