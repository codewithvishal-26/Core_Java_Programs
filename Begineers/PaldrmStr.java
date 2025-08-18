package Begineers;

public class PaldrmStr {
    public static void main(String[] args) {
        String str = "madam";
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                break;
            }
        }   
}
}
