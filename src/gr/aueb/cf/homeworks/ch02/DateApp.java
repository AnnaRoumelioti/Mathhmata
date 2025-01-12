package gr.aueb.cf.homeworks.ch02;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;
        int formattedYear = 0;

        System.out.println("Please type your date of birth");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        formattedYear = year % 100;

        System.out.printf("Your Birthday is: %02d/%02d/%02d", day, month, formattedYear);
    }
}
