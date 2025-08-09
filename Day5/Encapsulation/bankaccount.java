package assignment_5;
//q3
import java.util.ArrayList;
import java.util.List;

public class bankaccount {
	
	private String accountnumber;
	private String accountholder;
	private double balance;
	private List<Transaction> transactions;
	
	
	public bankaccount(String accountnumber,String accountholder,double initalbalance){
		
		this.accountnumber=accountnumber;
		this.accountholder=accountholder;
		this.balance=(initalbalance>=0) ? initalbalance:0;
		this.transactions = new ArrayList<>();
        if (initalbalance > 0) {
            transactions.add(new Transaction("Deposit", initalbalance));
        }
	}
	
	public void deposit(double amt) {
		if(amt<0) {
			System.out.println("deposite amount must be positive");
		}else {
			balance+=amt;
			transactions.add(new Transaction("Deposit", amt));
		}
	}

    public boolean withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return false;
        } else if (amt > balance) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance -= amt;
            transactions.add(new Transaction("Withdraw", amt));
            return true;
        }
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public String getLastTransaction() {
        if (transactions.isEmpty()) {
            return "No transactions available.";
        }
        return transactions.get(transactions.size() - 1).toString();
    }
    public String toString() {
        String masked = "****" + accountnumber.substring(accountnumber.length() - 4);
        return "Account Holder: " + accountholder +
               "\nAccount Number: " + masked +
               "\nBalance: $" + String.format("%.2f", balance);
    }
    
    // Private inner class
    private class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
        public String toString() {
            return type + " of $" + String.format("%.2f", amount);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 bankaccount acc = new bankaccount("123456789012", "John Doe", 500);

	        System.out.println(acc);
	        System.out.println("Last Transaction: " + acc.getLastTransaction());

	        acc.deposit(150);
	        acc.withdraw(1000); // Should fail
	        acc.withdraw(200);

	        System.out.println("\nAfter Transactions:");
	        System.out.println(acc);
	        System.out.println("Last Transaction: " + acc.getLastTransaction());

	}
}


