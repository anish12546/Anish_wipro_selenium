//Q3
package Assignment8_DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistorySimulation {
    public static void main(String[] args) {
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        String currentPage = "home";

        while (true) {
            System.out.println("\nCurrent page: " + currentPage);
            System.out.println("Options: 1. Visit new page  2. Back  3. Forward  4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            if (choice == 1) {
                System.out.print("Enter new page URL: ");
                String newPage = sc.nextLine();
                backStack.push(currentPage);
                currentPage = newPage;
                forwardStack.clear();
            } else if (choice == 2) {
                if (!backStack.isEmpty()) {
                    forwardStack.push(currentPage);
                    currentPage = backStack.pop();
                } else {
                    System.out.println("No page to go back to.");
                }
            } else if (choice == 3) {
                if (!forwardStack.isEmpty()) {
                    backStack.push(currentPage);
                    currentPage = forwardStack.pop();
                } else {
                    System.out.println("No page to go forward to.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting browser simulation.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
