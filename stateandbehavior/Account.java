package stateandbehavior;

public class Account {
	double balance;
	double interestRate;
	
	
	 void deposit(double dt) {
		if(dt>=0) {
			this.balance = balance + dt;
		}
	}
	
	void addInterest() {
		deposit(balance * interestRate / 100);
	}
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	void setInterestRate(double nyRentefot) {
		this.interestRate = nyRentefot;
	}
	

	public String toString() {
		return "Din balanse er: " + getBalance();
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		account.setInterestRate(5);
		account.deposit(100);
		System.out.println(account);
		account.addInterest();
		System.out.println(account);
	}
}
