package gr.aueb.cf.ch04;

/**
 * Reads a char as a byte.
 */

import java.util.Scanner;
import java.io.IOException;

public class CharInApp {
    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
        //ch = (char) System.in.read();
        ch = scanner.nextLine().charAt(0); //0 -> the order of the char

        System.out.printf("%c", ch);
    }
}
