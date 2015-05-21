public class SUV extends Car {

	private boolean isOffroad;
	
	public SUV() {
		
	}
	
	public SUV(double price, boolean isOffroad) {
		super(price);
		setIsOffroad(isOffroad);
	}
	
	public boolean getIsOffroad() {
		return isOffroad;
	}
	
	public void setIsOffroad(boolean isOffroad) {
		this.isOffroad = isOffroad;
	}
}
