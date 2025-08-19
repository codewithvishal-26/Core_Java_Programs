package Begineers;

public class Duplicate {
    public static void main(String[] args) {
        String str = "vishal chandrabanshi";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                }

            }
            if (count > 0) {
                System.out.println("Character '" + ch + "' is repeated " + count + " times.");
            }   
        }
        System.out.println("No duplicate characters found.");
    }
}
