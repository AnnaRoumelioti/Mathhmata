package gr.aueb.cf.ch02;

/**
 * A small frog wants to go to the other side of the road.
 * The frog is currently located at position X and wants to
 * go at a position greater or equal to Y. The small frog jumps a
 * fixed distance, D. Find the minimum number of jumps.
 *
 * For instance:
 *
 * X = 10
 * Y = 85
 * D = 30
 *
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 */

public class FrogJumpsApp {
    public static void main(String[] args) {
        double startX = 10;
        double finishY = 85;
        final double JUMPS = 30;
        double totalJumps;

        totalJumps = (finishY - startX) / JUMPS;

        System.out.printf("The frog should make %.1f jumps to reach the destination %.0f\n", totalJumps, finishY);


        // calculate jumps -> Teacher's variant
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double) hop); // ceil -> round up

        System.out.println(" Jumps: " + jumps);
    }
}
