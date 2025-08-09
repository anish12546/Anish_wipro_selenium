//Q15
package assignment10;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class WriteAndAppend {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("write.txt");
        Files.write(path, Arrays.asList("First line"), StandardOpenOption.CREATE);
        Files.write(path, Arrays.asList("Appended line"), StandardOpenOption.APPEND);
    }
}
