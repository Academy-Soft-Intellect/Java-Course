public class Car {
	
	public static int carsCount = 0;
	
	private String brand;
	private String model;
	
	public Car(){
		this.brand = "";
		this.model = "";
		
		carsCount++;
	}

	public Car(String brand, String model) {
		this();
		
		this.setBrand(brand);
		this.setModel(model);
	}

	public static int getCarsCount() {
		return carsCount;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
