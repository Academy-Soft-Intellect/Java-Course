
public class Person implements Walkable {
	
	protected String firstName;
	protected String lastName;
	
	public Person(){
		
	}
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void walk() {
		System.out.println("Walking...");
		
	}
	
	public void walk(int distrance) {
		System.out.println("Walking " + distrance  + " kilometers...");
		
	}
	

}
