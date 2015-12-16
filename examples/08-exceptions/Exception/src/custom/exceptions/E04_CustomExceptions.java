package custom.exceptions;

import custom.exceptions.classes.BankAccount;
import custom.exceptions.classes.WithdrawException;

public class E04_CustomExceptions {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Bill Gates", 100);
		
		try {
			double money = 200d;
			myAccount.withdraw(money);
			
			System.out.println("Successful transaction.");
			
		} catch (WithdrawException e) {
			System.out.println("An error has occurred during the transaction! " + e.getMessage());
		} finally {
			System.out.println("Operation is completed.");
		}
	}

}
