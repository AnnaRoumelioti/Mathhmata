package gr.aueb.cf.ch02;

public class IntApp {
    /**
     * Εμφανίζει τους τύπους δεδομένων ακεραίων,
     * int, byte, short, long μαζί με το μέγεθός τους,
     * και το range (min, max).
     */

    public static void main(String[] args) {
        System.out.printf("int. Size: %d, Min: %d, Max: %d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d, Min: %d, Max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d, Min: %d, Max: %d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d, Min: %d, Max: %d\n\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("int. Size: %d bits, Min: %d, Max: %d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d bits, Min: %d, Max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d bits, Min: %d, Max: %d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d bits, Min: %d, Max: %d\n\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("int. Size: %d bits, Min: %,d, Max: %,d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d bits, Min: %d, Max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d bits, Min: %d, Max: %d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d bits, Min: %,d, Max: %,d", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
