public class Fruit extends Stock {

	private boolean isFresh;
	private boolean isSweet;
	
	public Fruit() {
		
	}
	
	public Fruit(double price, boolean isFresh, boolean isSweet) {
		super(price);
		setIsFresh(isFresh);
		setIsSweet(isSweet);
	}
	
	public boolean getIsFresh() {
		return isFresh;
	}
	
	public void setIsFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public boolean getIsSweet() {
		return isSweet;
	}
	
	public void setIsSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}
}
