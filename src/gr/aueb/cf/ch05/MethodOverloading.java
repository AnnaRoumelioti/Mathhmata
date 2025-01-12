package gr.aueb.cf.ch05;

/**
 * Demo of method overloading.
 */

public class MethodOverloading {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) { //add(int a, int b) = signature of the method and can't be used multiple times
        return a + b;
    }

    public static int add(int a, long b) { // int is changes, so it is not the same signature anymore
        return a + (int) b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
