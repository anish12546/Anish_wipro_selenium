package Assignment_7;



class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

class CounterThread extends Thread {
    Counter counter;

    CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}


public class Q10 {

	public static void main(String[] args) {
		Counter c = new Counter();

        CounterThread t1 = new CounterThread(c);
        CounterThread t2 = new CounterThread(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final counter value: " + c.count);

	}

}