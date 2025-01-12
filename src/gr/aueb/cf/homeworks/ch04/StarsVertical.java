package gr.aueb.cf.homeworks.ch04;

import java.util.Scanner;

public class StarsVertical {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Please insert a number");
        int num = 0;
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }

    }
}
