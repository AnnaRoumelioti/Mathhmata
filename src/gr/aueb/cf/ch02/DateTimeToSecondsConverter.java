package gr.aueb.cf.ch02;

import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά, δευτερόλεπτα,
 * σε συνολικά δευτερόλεπτα. Ο χρήστης δίνει τα
 * δεδομένα και εκτυπώνεται το τελικό αποτέλεσμα.
 */

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        int days;
        int hours;
        int mins;
        int secs;
        int totalSecs = 0;
        final int SECONDS = 60;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_DAY = 3600 * 24;

        Scanner in = new Scanner(System.in);

        System.out.println("Please type days, hours, minutes and seconds");
        days = in.nextInt();
        hours = in.nextInt();
        mins = in.nextInt();
        secs = in.nextInt();
        totalSecs = days * SEC_PER_DAY + hours * SEC_PER_HOUR + mins * SECONDS + secs;

        System.out.printf("Total seconds are %d", totalSecs);
    }

}
