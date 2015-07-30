package CustomExceptions;

public class WithdrawException extends Exception {

	public WithdrawException(){
		super();
	}
	
	 public WithdrawException(String message) {
        super(message);
     }
	
}
