public class Item {
	
	private String name;
	private long barcode;
	private double price;
	private int count;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String name, long barcode, double price, int count) {
		super();
		this.name = name;
		this.barcode = barcode;
		this.price = price;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBarcode() {
		return barcode;
	}
	public void setBarcode(long barcode) {
		if (barcode <= 0) {
			return;
		}
		this.barcode = barcode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price < 0) {
			return;
		}
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if (count < 0) {
			return;
		}
		this.count = count;
	}
	public double getTotalPrice() {
		return this.count * this.price;
	}
}
