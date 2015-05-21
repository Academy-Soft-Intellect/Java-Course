public class Dessert extends Stock {

	private boolean isCold;
	private boolean isFruty;
	
	public Dessert() {
		
	}
	
	public Dessert(double price, boolean isCold, boolean isFruty) {
		super(price);
		setIsCold(isCold);
		setIsFruty(isFruty);
	}
	
	public boolean getIsCold() {
		return isCold;
	}
	
	public void setIsCold(boolean isCold) {
		this.isCold = isCold;
	}
	
	public boolean getIsFruty() {
		return isFruty;
	}
	
	public void setIsFruty(boolean isFruty) {
		this.isFruty = isFruty;
	}
}
