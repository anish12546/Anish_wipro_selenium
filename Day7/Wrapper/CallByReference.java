//Q10
package Assignment_7;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class CallByReference {

    public static void increment(IntWrapper w) {
        w.value++;
        System.out.println("Inside method: value = " + w.value);
    }

    public static void main(String[] args) {
        IntWrapper myInt = new IntWrapper(10);
        System.out.println("Before method call: value = " + myInt.value);

        increment(myInt);

        System.out.println("After method call: value = " + myInt.value);
    }
}
