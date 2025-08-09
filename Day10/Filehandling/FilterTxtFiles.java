//Q9
package assignment10;

import java.io.*;

public class FilterTxtFiles {
    public static void main(String[] args) {
        File dir = new File(".");
        FilenameFilter filter = (f, name) -> name.endsWith(".txt");
        File[] files = dir.listFiles(filter);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
