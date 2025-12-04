package Begineers;

public class Pow_num_rec {
    static int power(int base, int exp) {
        if (exp == 0)               // base case
            return 1;
        return base * power(base, exp - 1); // recursive case
    }
    public static void main(String[] args) {
        int base = 2; // Example base
        int exp = 5;  // Example exponent

        System.out.println(base + " raised to the power of " + exp + " is: " + power(base, exp));
    }
}
