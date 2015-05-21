public class Automobile extends Car {

	private double fuelConsumption;
	
	public Automobile() {
		
	}
	
	public Automobile(double price, double fuelConsumption) {
		super(price);
		setFuelConsumption(fuelConsumption);
	}
	
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
}
