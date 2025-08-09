package Assignment9_filehandling;

import java.io.File;
import java.util.Scanner;

public class Q11_ListFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();

        File dir = new File(dirPath);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles(file -> file.isFile()); // only files, no directories
            if (files != null) {
                System.out.println("Files in directory:");
                for (File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("Could not access files in directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
        sc.close();
    }
}
