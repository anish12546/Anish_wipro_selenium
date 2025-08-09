//Q7
package Assignment_7;

class Data {
    int value;

    Data(int value) {
        this.value = value;
    }
}

public class Callbyvalue {

    // Method that modifies the object's field (this WILL affect the original object)
    public static void modifyField(Data d) {
        d.value = 100;
        System.out.println("Inside modifyField(): value = " + d.value);
    }

    
    public static void reassignObject(Data d) {
        d = new Data(999);  
        System.out.println("Inside reassignObject(): value = " + d.value);
    }

    public static void main(String[] args) {
        Data original = new Data(50);
        System.out.println("Before modifyField(): value = " + original.value);
        modifyField(original);  
        System.out.println("After modifyField(): value = " + original.value); 
        System.out.println("\nBefore reassignObject(): value = " + original.value);
        reassignObject(original);  
        System.out.println("After reassignObject(): value = " + original.value);  
    }
}

