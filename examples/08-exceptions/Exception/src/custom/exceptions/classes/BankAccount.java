package custom.exceptions.classes;

public class BankAccount {
	
	private String name;
	
	private double dollars;
	
	public BankAccount(String name, double dollars){
		this.name = name;
		this.dollars = dollars;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void withdraw(double dollars) throws WithdrawException{
		if(this.dollars < dollars){
			throw new WithdrawException("Not enough money!");
		}
	}
	
	
	
}
