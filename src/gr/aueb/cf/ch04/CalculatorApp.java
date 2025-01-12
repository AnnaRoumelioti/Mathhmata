package gr.aueb.cf.ch04;

/**
 * Διαβάζουμε τον 1ο αριθμό, μετά το σύμβολο της πράξης
 * και μετά τον 2ο αριθμό
 */

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int results = 0;
        int choice = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Please insert an int, an operator and a 2nd int");
        num1 = in.nextInt();
        operator = in.next().charAt(0);
        num2 = in.nextInt();

        switch (operator) {
            case '+':
                results = num1 + num2;
                break;
            case '-':
                results = num1 - num2;
                break;
            case '*':
                results = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    results = num1 / num2;
                }
                break;
            case '%':
                if (num1 != 0) {
                    results = num1 % num2;
                }
                break;
            default:
                System.out.println("Error in operator");
                isError = true;
                break;
        }
        if (!isError) {
            System.out.printf("%d %c %d = %d", num1, operator, num2, results);
        }
    }
}
