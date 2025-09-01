package Begineers;

import java.util.Scanner;

public class AsciiVal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any String");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            System.out.println("Character : " + ch + " || Ascii Value: " + ascii);
        }
        sc.close();
    }
}
