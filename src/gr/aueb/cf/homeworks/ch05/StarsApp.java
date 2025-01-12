package gr.aueb.cf.homeworks.ch05;

import java.util.Scanner;

public class StarsApp {
    public static void main(String[] args) {
        int choice = 0;
        int numOfStart = 0;
        Scanner in = new Scanner(System.in);

        do {
            printMenu();
            choice = in.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Wrong choice");
                continue;
            }
            if (choice != 6 ) {
                System.out.println("Insert a number of starts");
                numOfStart = in.nextInt();
            }

            switch (choice) {
                case 1:
                    printStarsH(numOfStart);
                    break;
                case 2:
                    printStarsV(numOfStart);
                    break;
                case 3:
                    printStarsHV(numOfStart);
                    break;
                case 4:
                    printStarsAsc(numOfStart);
                    break;
                case 5:
                    printStarsDesc(numOfStart);
                    break;
                case 6:
                    System.out.println("Quiting...");
                    break;
                default:
                    System.out.println("Error in choice ");
                    break;
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Οριζόντια Αστεράκια");
        System.out.println("2. Κάθετα Αστεράκια");
        System.out.println("3. nxm Αστεράκια");
        System.out.println("4. Ascending Αστεράκια");
        System.out.println("5. Descending Αστεράκια");
        System.out.println("6. Έξοδος");
    }

    /**
     * Prints n stars horizontally.
     *
     * @param n     the number of stars
     */
    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints n stars vertically.
     *
     * @param n     the number of stars
     */
    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
        }
        System.out.println();
    }
}




