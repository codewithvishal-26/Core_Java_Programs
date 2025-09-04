package Begineers;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the first String: ");
        String str1 = sc.nextLine();

        System.err.println("Enter the sencond string: ");
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Both Strings are anagram! ");
        }else {
            System.out.println("Both strings are not anagram! ");
        }

        sc.close();
    }
}
