//Q13
package assignment10;

import java.io.IOException;
import java.nio.file.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp.txt");
        Files.createFile(path);
        Files.move(path, Paths.get("moved.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.delete(Paths.get("moved.txt"));
    }
}
