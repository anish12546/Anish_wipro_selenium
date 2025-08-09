//Q6
package assignment10;

import java.io.*;

public class FileStats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        int lines = 0, words = 0, characters = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            lines++;
            characters += line.length();
            words += line.split("\\s+").length;
        }
        reader.close();
        System.out.println("Lines: " + lines + ", Words: " + words + ", Characters: " + characters);
    }
}

