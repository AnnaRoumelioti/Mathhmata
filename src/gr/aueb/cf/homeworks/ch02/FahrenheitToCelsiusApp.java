package gr.aueb.cf.homeworks.ch02;

import java.util.Scanner;

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int fahrTemp;
        int celTemp;

        System.out.println("Please type the Fahrenheit temperature:");
        fahrTemp = in.nextInt();

        celTemp = 5 * (fahrTemp - 32) / 9;

        System.out.printf("The Fahrenheit temperature %d = Celcius %d or %d\u2109 = %d\u2103\n", fahrTemp, celTemp, fahrTemp, celTemp);


    }
}
