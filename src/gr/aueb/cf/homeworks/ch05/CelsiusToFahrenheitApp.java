package gr.aueb.cf.homeworks.ch05;

import java.util.Scanner;

public class CelsiusToFahrenheitApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double celTemp;
        double fahrTemp;


        System.out.println("Please type the Celcius temperature:");
        celTemp = scanner.nextDouble();

        fahrTemp = (celTemp * 9 / 5) + 32;

        System.out.printf("The Celcius temperature %2f = Fahrenheit %2f", celTemp, fahrTemp);


    }
}
