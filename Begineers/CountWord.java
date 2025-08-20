package Begineers;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter any Sentence: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        int count = words.length;

        System.err.println("Total words: " + count);

        sc.close();
    }
}
