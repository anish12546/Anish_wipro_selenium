package Assignment_7;



class PrintEvenOdd {
    private int limit = 10;
    private int number = 1;

    public synchronized void printOdd() {
        while (number <= limit) {
            if (number % 2 == 1) {
                System.out.println("Odd: " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= limit) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Q6 {

	
	public static void main(String[] args) {
		PrintEvenOdd printer = new PrintEvenOdd();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();

	}

}