package Assignment_7;



class MessageBox {
    private String message;
    private boolean hasMessage = false;

    public synchronized void put(String msg) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message = msg;
        hasMessage = true;
        System.out.println("Produced: " + msg);
        notifyAll();    }

    public synchronized void get() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + message);
        hasMessage = false;
        notifyAll();
    }
}

public class Q16 {

	public static void main(String[] args) {
		MessageBox box = new MessageBox();

        Thread producer = new Thread(() -> {
            String[] messages = { "Hi", "Hello", "Welcome", "Bye" };
            for (String msg : messages) {
                box.put(msg);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                box.get();
            }
        });

        Thread consumer2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                box.get();
            }
        });

        producer.start();
        consumer1.start();
        consumer2.start();

	}

}
