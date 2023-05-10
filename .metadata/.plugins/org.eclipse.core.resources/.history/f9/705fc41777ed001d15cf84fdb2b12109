package Assignment;

public class Custom_Exception {
	public static void main(String args[]) {
		Custom_Exception d = new Custom_Exception();
		CheckingAccount ca = new CheckingAccount(101);
		ca.deposite(10000);
		try {
			ca.withdral(70000);
			System.out.println("Your balance is = " +ca.getbalance());	
		    }catch
		    (InsufficintFundException e) {
		    	System.out.println("You have no sufficient balance,you need more" +e.getAmount());
		    	System.out.println("Your balance is = " +ca.getbalance());
		    }
	}
	
public class CheckingAccount {
	private int acn;
	private double balance;
	
	public CheckingAccount(int acn) {
		this.acn = acn;
	}
	
	public void deposite(double amount) {
		this.balance = amount;
	}
	
	public void withdral(double amount)throws InsufficintFundException {
		if (amount <= balance) {
			balance = balance - amount;
		}
		else {
			double needs = amount - balance;
			throw new InsufficintFundException(needs);
		}
	}
	public double getBalance() {
		return balance;
	}
}

public class InsufficintFundException extends Exception {
		double amount;
	public InsufficintFundException(double amount) {
		this.amount = amount;
		}
	public double getAmount() {
		return amount;
	 }
   }
}