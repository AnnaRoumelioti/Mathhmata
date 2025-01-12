package gr.aueb.cf.ch02;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ένα ποσό σε Ευρώ
 * και μετατρέπει από Ευρώ σε USD και cents.
 * Η ισοτιμία 99 cents = 1 Ευρώ. Εκτυπώνει το
 * αποτέλεσμα.
 */

public class EuroUsdConverter {

    public static void main(String[] args) {

        int euro = 0;
        int usd = 0;
        int usdCent = 0;
        int totalUsaCents = 0;
        final int PARITY = 99;

    Scanner in = new Scanner(System.in);

    System.out.println("Please inset an amount of Euro");
    euro = in.nextInt();

    totalUsaCents = euro * PARITY;
    usd = totalUsaCents / 100;
    usdCent = totalUsaCents % 100;

    System.out.printf("%d\u20AC = %d\u0024,%dcents", euro, usd, usdCent); // u = unicode


    }
}
