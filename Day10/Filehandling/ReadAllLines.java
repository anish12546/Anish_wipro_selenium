//Q14
package assignment10;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class ReadAllLines {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("test.txt"));
        lines.forEach(System.out::println);
    }
}
