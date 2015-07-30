package CustomExceptions;

import java.math.BigDecimal;

public class BankAccount {
	
	private String name;
	private BigDecimal dollars;
	
	public BankAccount(String name, BigDecimal dollars){
		this.name = name;
		this.dollars = dollars;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void withdraw(BigDecimal dollars) throws WithdrawException{
		if(this.dollars.compareTo(dollars) == -1){
			throw new WithdrawException("Недостатъчна наличност");
		}
	}
	
	
	
}
