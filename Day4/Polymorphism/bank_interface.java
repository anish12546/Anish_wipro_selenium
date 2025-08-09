package assignment_4;

interface bans{
	void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class account{
	String accountnumber;
	double balance;
	

    account(String accountNumber, double balance) {
        this.accountnumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Current Balance: " + balance);
    }
}
class SavingsAccount extends account implements bans {
	private static final double min_balance=500;

    SavingsAccount(String accNum, double balance) {
        super(accNum, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Savings: " + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount < min_balance) {
            System.out.println("Withdrawal failed: Minimum balance of " + min_balance + " must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class bank_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("SA001", 1000);
        sa.deposit(500);
        sa.withdraw(1100); 
        sa.withdraw(800);  
        System.out.println("Final Balance: " + sa.getBalance());

	}

}
