package gr.aueb.cf.ch06;

public class ArrayHello {
    public static void main(String[] args) {
        int[] arr = new int[3]; //Declare and init

        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}