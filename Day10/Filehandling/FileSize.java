//Q18
package assignment10;

import java.io.IOException;
import java.nio.file.*;

public class FileSize {
    public static void main(String[] args) throws IOException {
        long size = Files.size(Paths.get("test.txt"));
        System.out.println("File size: " + size + " bytes");
    }
}
