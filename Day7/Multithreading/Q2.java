package Assignment_7;

class myrun1 implements Runnable
{
	public void run()
	{
		System.out.println("The name of the current thread is: "+Thread.currentThread().getName());
	}
}

public class Q2 {

	public static void main(String[] args) {
		myrun1 t = new myrun1();
		
		Thread t1=new Thread(t);

		t1.start();

	}

}