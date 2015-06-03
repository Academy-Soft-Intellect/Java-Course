public class Vegetable extends Stock {
	
	private boolean isFresh;
	private boolean isBiological;
	
	public Vegetable() {}
	
	public Vegetable(double price, boolean isFresh, boolean isBiological) {
		super(price);
		setIsFresh(isFresh);
		setIsBiological(isBiological);
	}
	
	public boolean getIsFresh() {
		return isFresh;
	}
	
	public void setIsFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public boolean getIsBiological() {
		return isBiological;
	}
	
	public void setIsBiological(boolean isBiological) {
		this.isBiological = isBiological;
	}
}
