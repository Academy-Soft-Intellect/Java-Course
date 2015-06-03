package classes;
import interfaceses.CheckHomework;

public abstract class Person implements CheckHomework {

	private static int count;
	protected String firstName;
	protected String lastName;
	protected int experienceInYears;
	
	public Person() {
		count++;
	}
	
	public Person(String firstName, String lastName, int experienceInYears) {
		setFirstName(firstName);
		setLastName(lastName);
		setExperienceInYears(experienceInYears);
		count++;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getExperienceInYears() {
		return experienceInYears;
	}
	
	public void setExperienceInYears(int experienceInYears) {
		
		if (experienceInYears >= 0) {
			this.experienceInYears = experienceInYears;
		} 
	}
	
	public void helloGreet() {
		System.out.println("Hello!");
	}
	
	public static int getCount() {
		return count;
	}
}
