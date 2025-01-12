package gr.aueb.cf.ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Copy line-by-line to a new file.
 */

public class BufferedReaderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/temp/bf-read.txt"))) {
            String line = "";

            while (( line = bf.readLine() ) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb);
    }
}