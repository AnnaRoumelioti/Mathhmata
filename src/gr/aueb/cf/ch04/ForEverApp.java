package gr.aueb.cf.ch04;

public class ForEverApp {
    public static void main(String[] args) {
        int count = 0;

        for (;;){
            System.out.println("Forever");
            count++;

            if (count % 20 == 0) { System.out.println();
            if (count == 100) break;
            }
        }
    }
}
