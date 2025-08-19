package Begineers;

/**
 * This class finds the first non-repeating character in a given string.
 */

public class NonRepChar {
    public static void main(String[] args) {
        String str = "vishal chandrabanshi";
        char result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0; 

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1) {
                result = ch;

                break; // Exit the loop after finding the first non-repeating character
            }   
        }
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}