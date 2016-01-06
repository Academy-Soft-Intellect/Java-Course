package test;

public class Company {
	
	private String name;
	public String getName() {
		return name;
	}
	public Company(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private int count;

}
