//Q16
package assignment10;

import java.io.IOException;
import java.nio.file.*;

public class WalkDirectory {
    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get(".")).forEach(System.out::println);
    }
}
