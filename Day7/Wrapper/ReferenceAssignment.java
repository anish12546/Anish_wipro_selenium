//8
package Assignment_7;

class Item {
    String name;

    Item(String name) {
        this.name = name;
    }
}

public class ReferenceAssignment {

    // Method that tries to reassign the object
    public static void reassignItem(Item item) {
        System.out.println("Inside method - before reassignment: " + item.name);
        item = new Item("New Item");  
        System.out.println("Inside method - after reassignment: " + item.name);
    }

    public static void main(String[] args) {
        Item originalItem = new Item("Original Item");

        System.out.println("Before method call: " + originalItem.name);
        reassignItem(originalItem);  
        System.out.println("After method call: " + originalItem.name); 
    }
}
