package gr.aueb.cf.homeworks.ch04;

/**+
 * n = number of lines
 * m = number of stars per line
 */

import java.util.Scanner;

public class StarsNxm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m = 0;

        System.out.println("Please insert number of lines and stars");
        n = in.nextInt();
        m = in.nextInt();

        System.out.println("N x M Stars");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

