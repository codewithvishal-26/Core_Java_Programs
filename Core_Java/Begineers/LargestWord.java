package Begineers;

import java.util.Scanner;


public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter any Sentence: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        String largest = words[0];

        for(String word : words){
            if(word.length() > largest.length()){
                largest = word;
            }
        }

        System.err.println("Largest word: " + largest);
        System.err.println("Length: " + largest.length());

        sc.close();
    }
    
}
