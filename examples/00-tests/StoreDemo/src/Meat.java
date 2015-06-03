public class Meat extends Stock {

	private boolean isCooked;
	private double weight;
	
	public Meat() {
		
	}
	
	public Meat(double price, boolean isCooked, double weight) {
		super(price);
		setIsCooked(isCooked);
		setWeight(weight);
	}
	
	public boolean getIsCooked() {
		return isCooked;
	}
	
	public void setIsCooked(boolean isCooked) {
		this.isCooked = isCooked;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
