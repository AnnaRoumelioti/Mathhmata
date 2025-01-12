package gr.aueb.cf.homeworks.ch03;

import java.util.Scanner;

/**
 * identify with year is a leap one
 */

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert the year");
        year = in.nextInt();

        /*if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        }*/

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }
}
