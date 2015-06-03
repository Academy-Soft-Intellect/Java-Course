public class Shop {

	private String name;
	private String location;
	
	private Stock[] stock;
	
	public Shop() {
		
	}
	
	public Shop(String name, String location, Stock[] stock) {
		setName(name);
		setLocation(location);
		setStock(stock);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Stock[] getStock() {
		return stock;
	}
	
	public void setStock(Stock[] stock) {
		this.stock = stock;
	}
	
	public void addProduct(Stock product) {
		if(product instanceof Dessert){
			Dessert.setIsAvailable(true);
		} 
		else if(product instanceof Drink){
			Drink.setIsAvailable(true);
		}
		else if(product instanceof Fruit){
			Fruit.setIsAvailable(true);
		}
		else if(product instanceof Meat){
			Meat.setIsAvailable(true);
		}
		else if(product instanceof Vegetable){
			Vegetable.setIsAvailable(true);
		}
		else {
			System.out.println("Unsupported Type");
		}
		
	}
	
	public void removeProduct(Stock product) {
		if(product instanceof Dessert){
			Dessert.setIsAvailable(false);
		} 
		else if(product instanceof Drink){
			Drink.setIsAvailable(false);
		}
		else if(product instanceof Fruit){
			Fruit.setIsAvailable(false);
		}
		else if(product instanceof Meat){
			Meat.setIsAvailable(false);
		}
		else if(product instanceof Vegetable){
			Vegetable.setIsAvailable(false);
		}
		else {
			System.out.println("Unsupported Type");
		}
		
	}
}
