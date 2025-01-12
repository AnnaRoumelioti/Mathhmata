package gr.aueb.cf.ch02;

public class RandomApp {
    public static void main(String[] args) {

        int die = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random()); //random is a method of Math, provided a fake data between 0-1 -> [0 - 1) from 0 till 0,99

        System.out.println(die);
        System.out.println(die2);
    }
}
