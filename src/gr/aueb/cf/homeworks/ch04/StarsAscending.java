package gr.aueb.cf.homeworks.ch04;

import java.util.Scanner;

public class StarsAscending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int star = 0;

        System.out.println("Insert number of stars");
        star = in.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
