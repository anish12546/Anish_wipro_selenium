//Q2
package assignment10;

import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.exists() ? "File exists." : "File does not exist.");
    }
}
