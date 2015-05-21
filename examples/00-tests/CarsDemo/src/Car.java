public abstract class Car {

	private double price;
	
	public Car() {
		
	}
	
	public Car(double price) {
		setPrice(price);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
