package gr.aueb.cf.homeworks.ch05;

public class isPrimeApp {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(num + " is prime: " + isPrime(num));
        System.out.println(num + " is not prime: " + isNotPrime(num));
    }
    public static boolean isPrime(int num) {
        return num % 2 == 0;
    }
    public static boolean isNotPrime(int num) {
        return !isPrime(num);
    }
}
