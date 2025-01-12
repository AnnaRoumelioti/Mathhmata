package gr.aueb.cf.ch02;

public class PrintApp {

    public static void main(String[] args) {
        int day = 3;
        int month = 7;
        int year = 2024;

        System.out.print("The date is: " + day + "/" + month + "/" + year); // with println can't be formatted
        System.out.println("\nThe date is: " + day + "/" + month + "/" + year);
        System.out.printf("The date is: %d/%d/%d %n", day, month, year); // no padding. With printf can be formatted; %n = change line
        System.out.printf("The date is: %2d/%2d/%6d %n", day, month, year); // number in the %d is a number of places of empty padding
        System.out.printf("\nThe date is: %02d/%02d/%06d", day, month, year); // 0 will be added to the empty paddings
    }
}
