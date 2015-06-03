public class Drink extends Stock {

	private boolean isAlcoholic;
	private boolean isHot;
	
	public Drink() {
		
	}
	
	public Drink(double price, boolean isAlcoholic, boolean isHot) {
		super(price);
		setIsAlcoholic(isAlcoholic);
		setIsHot(isHot);
	}
	
	public boolean getIsAlcoholic() {
		return isAlcoholic;
	}
	
	public void setIsAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	
	public boolean getIsHot() {
		return isHot;
	}
	
	public void setIsHot(boolean isHot) {
		this.isHot = isHot;
	}
}
