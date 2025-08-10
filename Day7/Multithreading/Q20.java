package Assignment_7;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Q20 {

	public static void main(String[] args) {
		Callable<Integer> task = () -> {
            int a = 6;
            int b = 7;
            return a * b;
        };

        FutureTask<Integer> future = new FutureTask<>(task);

        Thread thread = new Thread(future);
        thread.start();

        try {
            int result = future.get();
            System.out.println("Multiplication result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

	}

}