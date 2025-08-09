//Q5
package Assignment8_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchList {
    public static void main(String[] args) {
        
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fruit name to search: ");
        String searchItem = scanner.nextLine();

        
        if (fruits.contains(searchItem)) {
            System.out.println(searchItem + " is found in the list.");
        } else {
            System.out.println(searchItem + " is NOT found in the list.");
        }

        
    }
}
