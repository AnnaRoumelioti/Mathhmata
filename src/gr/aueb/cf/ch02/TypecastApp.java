package gr.aueb.cf.ch02;
/*
Typecasting is the process of converting the value of a single data type (such as an integer [int], float, or double)
 into another data type. This conversion is done either automatically or manually.
 */
public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;  // int literals -> int (and only int (not byte, double, etc.) -> 32-bit
        long num2 = 20L;

        num1 = (int) num2; // (int) - explicit typecast. This is typically done when the desired operation or context requires values of a specific type
    }
}
