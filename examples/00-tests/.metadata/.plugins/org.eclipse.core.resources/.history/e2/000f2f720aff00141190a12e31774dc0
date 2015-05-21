package homework6;

public abstract class Person {

	public static int count;
	protected String name;
	protected String lastName;
	protected int yearsOfWork;
	
	public Person() {}
	
	public Person(String name, String lastName, int yearsOfWork) {
		setName(name);
		setLastName(lastName);
		setYearsOfWork(yearsOfWork);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getYearsOfWork() {
		return yearsOfWork;
	}
	
	public void setYearsOfWork(int yearsOfWork) {
		if (yearsOfWork >= 0) {
			this.yearsOfWork = yearsOfWork;
		} else {
			System.out.println("Enter a positive number!");
		}
	}
}
