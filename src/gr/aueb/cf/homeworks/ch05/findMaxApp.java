package gr.aueb.cf.homeworks.ch05;

import java.util.Scanner;

public class findMaxApp {
    public static void main(String[] args) {
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        System.out.println("Max number is:" + Math.max(num1, Math.max(num2, num3)));

    }
}
