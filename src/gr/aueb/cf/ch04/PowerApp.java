package gr.aueb.cf.ch04;

/**
 * Calculates a^n.
 * e.g 2^10 = 1024.
 */

import java.math.BigInteger;

public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 100;
        int result = 1;

        // for to calculate base ^ power
        for (int i = 1; i <= power; i++) {
            result = result * base;     // result *= base; Here result will be 0, because it is too big, therefore BigInteger should be used
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " + bigResult);
    }
}
