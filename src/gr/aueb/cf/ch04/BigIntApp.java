package gr.aueb.cf.ch04;

import java.util.Scanner;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert a big number");
        a = BigInteger.valueOf(in.nextInt());
        b = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= b.intValue(); i++) {
            result = result.multiply(a);
        }
        System.out.printf("%d^%d = %,d", a, b, result);
    }
}
