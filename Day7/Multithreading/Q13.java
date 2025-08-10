package Assignment_7;



class Bank_acc
{
	int bal=0;
	
	synchronized void deposit(int amt)
	{
		bal+=amt;
		System.out.println("Amount deposited: "+amt);
	}
	
	synchronized void withdraw(int amt)
	{
		if(amt>=0 && amt<=bal)
		{
			bal-=amt;
			System.out.println("Amount Widrawn was: "+amt);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
}

public class Q13 {
	
	public static void main(String[] args) {
		
		Bank_acc b = new Bank_acc();

		Thread t1 = new Thread(()->b.deposit(15000));

		Thread t2 = new Thread(()->b.withdraw(10000));

		t1.start();
		t2.start();

	}

}