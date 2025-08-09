//Q17
package assignment10;


import java.io.IOException;
import java.nio.file.*;

public class CopyUsingFiles {
    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("test.txt"), Paths.get("copied.txt"), StandardCopyOption.REPLACE_EXISTING);
    }
}
