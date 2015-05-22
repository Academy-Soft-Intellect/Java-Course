public abstract class Stock {

	protected double price;
	protected static boolean isAvailable;
	
	public Stock() {
		
	}
	
	public Stock(double price) {
		setPrice(price);
		setIsAvailable(isAvailable);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static boolean getIsAvailable() {
		return isAvailable;
	}
	
	public static void setIsAvailable(boolean available) {
		isAvailable = available;
	}
}
