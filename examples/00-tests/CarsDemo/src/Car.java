public abstract class Car {

	protected double price;
	
	public Car() {
		setPrice(0);
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
