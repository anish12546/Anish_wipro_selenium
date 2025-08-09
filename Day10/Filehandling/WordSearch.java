//Q12
package assignment10;

import java.io.*;
import java.util.*;

public class WordSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String word = "Hello";
        int count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            for (String w : line.split("\\s+")) {
                if (w.equals(word)) {
                    count++;
                }
            }
        }
        reader.close();
        System.out.println("Occurrences of \"" + word + "\": " + count);
    }
}

