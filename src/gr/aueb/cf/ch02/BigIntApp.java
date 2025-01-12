package gr.aueb.cf.ch02;

import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("4368767438683689948");
        BigInteger bigNum2 = new BigInteger("684093876843096");
        BigInteger results;

        results = bigNum1.add(bigNum2);

        System.out.printf("%,d", results);

    }
}
