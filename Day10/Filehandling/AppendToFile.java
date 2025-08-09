//Q5
package assignment10;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt", true);
        writer.write("\nAppended Line");
        writer.close();
    }
}
