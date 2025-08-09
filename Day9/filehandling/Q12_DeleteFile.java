package Assignment9_filehandling;

import java.io.File;
import java.util.Scanner;

public class Q12_DeleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to delete: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println(fileName + " deleted successfully.");
            } else {
                System.out.println("Failed to delete " + fileName);
            }
        } else {
            System.out.println("File does not exist.");
        }
        sc.close();
    }
}
