package Assignment_7;


class Printer {
    private boolean letterTurn = true;

    public synchronized void printLetter(char letter) throws InterruptedException {
        while (!letterTurn) {
            wait();
        }
        System.out.print(letter + " ");
        letterTurn = false;
        notify();
    }

    public synchronized void printNumber(int number) throws InterruptedException {
        while (letterTurn) {
            wait();
        }
        System.out.print(number + " ");
        letterTurn = true;
        notify();
    }
}

public class Q15 {

	public static void main(String[] args) {
		Printer printer = new Printer();

        Thread letterThread = new Thread(() -> {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                try {
                    printer.printLetter(ch);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                try {
                    printer.printNumber(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        letterThread.start();
        numberThread.start();

	}

}
