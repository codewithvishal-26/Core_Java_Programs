package Begineers;

import java.util.Scanner;

public class StrToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any sentence: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        
        System.out.println("Character in given string: ");

        for(char c : chars){
            System.out.println(c);
        }
    }
}
