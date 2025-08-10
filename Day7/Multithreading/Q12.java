package Assignment_7;



class table
{
	synchronized void print_table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*n);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread
{
	table t;
	
	MyThread1(table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.print_table(1);
	}
}

class MyThread2 extends Thread
{
	table t;
	
	MyThread2(table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.print_table(5);
	}
}

public class Q12 {

	public static void main(String[] args) {
		table obj = new table();

		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
		
		

	}

}