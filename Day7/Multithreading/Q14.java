package Assignment_7;



class Simple
{
	void waitforsignals() throws InterruptedException
	{
		synchronized(this) {
			System.out.println("Waiting");
			wait();
			System.out.println("Resume");
		}
	}
	
	void givesignal()
	{
		synchronized(this)
		{
			notify();
		}
	}
}

public class Q14 {

	public static void main(String[] args) {
		Simple s =new Simple();
		Thread t1 = new Thread(()->
		{
			try
			{
				s.waitforsignals();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		});

		Thread t2 = new Thread(()->
		{
			try
			{
				Thread.sleep(5000);
				s.givesignal();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		});
		t1.start();
        t2.start();
		
		

	}

}
