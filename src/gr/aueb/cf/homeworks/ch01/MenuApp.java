package gr.aueb.cf.homeworks.ch01;

public class MenuApp {
    public static void main(String[] args) {

        String intro = "Εισαγωγή";
        String second = "Διαγραφή";
        String third = "Αναζήτηση";
        String forth = "Ενημέρωση";
        String fifth = "Έξοδος";
        String sixth = "Δώστε αριθμό επιλογής:";


        System.out.printf("  Επιλέξτε μία από τις παρακάτω επιλογές: " +
                "\n1. " + intro +
                "\n2. " + second +
                "\n3. " + third +
                "\n4. " + forth +
                "\n5. " + fifth +
                "\n   " + sixth);

        System.out.println("\n\n  Επιλέξτε μία από τις παρακάτω επιλογές");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        System.out.println("  Δώστε αριθμό επιλογής:");
    }
}
