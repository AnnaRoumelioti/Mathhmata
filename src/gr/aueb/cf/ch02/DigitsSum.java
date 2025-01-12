package gr.aueb.cf.ch02;

import java.util.Scanner;

/**
 * Λαμβάνει ως input από τον χρήστη ένα
 * διψήφιο ακέραιο και υπολογίζει και να
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει τον
 * ακέραιο 15, θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 = 6.
 */

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputDigits;
        int leftDigit;
        int rightDigit;
        int sum = 0;

        System.out.println("Please type a two-digit number");
        inputDigits = in.nextInt();

         leftDigit = inputDigits / 10; // Με div 10 παίρνουμε το αριστερό ψηφίο
         rightDigit = inputDigits % 10; // Με mod 10 παίρνουμε το δεξί ψηφίο
         sum = leftDigit + rightDigit;

        System.out.printf("Sum of the digits %d is %d + %d = %d",
                inputDigits, leftDigit, rightDigit, sum);

    }
}
