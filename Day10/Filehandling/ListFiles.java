//Q8
package assignment10;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
