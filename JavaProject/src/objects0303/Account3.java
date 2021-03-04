package objects0303;

public class Account3 {
	
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	

	// ¸Þ¼Òµå
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance > MIN_BALANCE && balance < MAX_BALANCE) {
			this.balance = balance;			
		}
	}
	
	

}
