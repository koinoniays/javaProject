package objects0303;

public class AccountExample {

	public static void main(String[] args) {
		Account3 account = new Account3();
		
		account.setBalance(10000);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());

	}

}
