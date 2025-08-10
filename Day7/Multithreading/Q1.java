package Assignment_7;



public class Q1 extends Thread {

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

    public static void main(String[] args) {
        Q1 t = new Q1();
        
        t.start();
    }

}