//Q3
package Assignment8_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveFruit {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the fruit to remove: ");
        String fruitToRemove = scanner.nextLine();

        
        if (fruits.remove(fruitToRemove)) {
            System.out.println(fruitToRemove + " was removed.");
        } else {
            System.out.println(fruitToRemove + " not found in the list.");
        }

       
        System.out.println("Updated fruit list: " + fruits);

       
    }
}

